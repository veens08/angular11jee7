package org.example.joris.app.services;

import org.example.joris.app.domain.Framework;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class FrameworkDaoService {

    @PersistenceContext(unitName = "corona-app")
    EntityManager em;

    public List<Framework> getFrameworks() {
        String jpql = "SELECT f FROM Framework f";
        TypedQuery<Framework> tq = em.createQuery(jpql, Framework.class);
        return tq.getResultList();
    }

    public long getNumberOfFrameworks() {
        TypedQuery<Long> tq = em.createQuery("SELECT count(f) FROM Framework f", Long.class);
        return tq.getSingleResult();
    }


    public void save(Framework framework) {

        em.persist(framework);
    }


}
