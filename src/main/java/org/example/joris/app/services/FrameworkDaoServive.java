package org.example.joris.app.services;

import org.example.joris.app.domain.Framework;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class FrameworkDaoServive {
    @PersistenceContext
    private EntityManager em;

    public List<Framework> getFrameworks(){
        String jpql = "SELECT f FROM Framework f";
        TypedQuery<Framework> tq = em.createQuery(jpql, Framework.class);
        return tq.getResultList();
    }
}
