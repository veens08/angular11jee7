package org.example.joris.app.resources;

import org.example.joris.app.domain.Framework;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/frameworks")
@Transactional(Transactional.TxType.REQUIRED)
public class FrameworkResource {

    @PersistenceContext(unitName = "corona-app")
    EntityManager em;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Framework> getFrameworks() {
        TypedQuery<Framework> query = em.createQuery("SELECT f FROM Framework f", Framework.class);
        List<Framework> frameworks = query.getResultList();
        return frameworks;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void saveFramework(Framework framework){
        em.persist(framework);
    }
}
