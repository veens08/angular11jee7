package org.example.joris.app.services;

import org.example.joris.app.domain.Framework;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Arquillian.class)
public class FrameworkDaoServiceIT {

    @Inject
    FrameworkDaoService frameworkDaoService;

    @Deployment
    public static WebArchive createDeployment() {
        WebArchive archive = ShrinkWrap.create(WebArchive.class)
                .addClasses(FrameworkDaoService.class, Framework.class)
                .addAsResource("META-INF/persistence.xml")
                .addAsResource("META-INF/beans.xml");

        System.out.println(archive.toString(true));
        return archive;
    }

    @Test
    public void getSomeFrameworks() {
        List<Framework> frameworks = frameworkDaoService.getFrameworks();
        assertTrue(frameworks.size() > 1);
    }

    @Test
    public void addFrameworkToDb() {
        long numberOfFrameworksBeforeSave = frameworkDaoService.getNumberOfFrameworks();

        frameworkDaoService.save(new Framework(randomInt(), "Elm", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Elm_logo.svg/1280px-Elm_logo.svg.png", 9));

        long numberOfFrameworksAfterSave = frameworkDaoService.getNumberOfFrameworks();
        assertEquals(1L, numberOfFrameworksAfterSave - numberOfFrameworksBeforeSave);
    }

    private int randomInt() {
        return new Random().nextInt(1000);
    }

}

