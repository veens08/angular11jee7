package org.example.joris.app.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;

class SetupOfDatabaseTests {

    @Test
    @Disabled("Alleen bedoeld om de tabellen aan te maken. Maakt gebruik van de persistence unit zoals gedefinieerd in de persistence.xml onder test/resource/META-INF")
    void createTableFrameworkAndInsertSomeFrameworks() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("puJavaTraject");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        ArrayList<Framework> frameworks = new ArrayList<>();
        frameworks.add(new Framework(1, "Angular", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/800px-Angular_full_color_logo.svg.png", 10));
        frameworks.add(new Framework(2, "React", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/React-icon.svg/1024px-React-icon.svg.png", 7));
        frameworks.add(new Framework(3, "Vue.js", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Vue.js_Logo_2.svg/1280px-Vue.js_Logo_2.svg.png", 7));

        tx.begin();
        for (Framework framework : frameworks) {
            em.persist(framework);
        }
        tx.commit();
    }
}
