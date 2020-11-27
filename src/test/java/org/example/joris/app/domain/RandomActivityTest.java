package org.example.joris.app.domain;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.ZonedDateTime;

class RandomActivityTest {

    @Test
        //@Disabled("Alleen bedoeld om de tabellen aan te maken. Maakt gebruik van de persistence unit zoals gedefinieerd in de persistence.xml onder test/resource/META-INF")
    void persistenDieHandel() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("puJavaTraject");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(new RandomActivity(1, ZonedDateTime.now(), "Bob"));
        tx.commit();
    }
}
