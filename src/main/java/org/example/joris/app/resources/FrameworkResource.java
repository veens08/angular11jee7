package org.example.joris.app.resources;

import org.example.joris.app.domain.Framework;
import org.example.joris.app.services.FrameworkDaoServive;

import javax.inject.Inject;
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

    @Inject
    private FrameworkDaoServive fds;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Framework> getFrameworks() {
        return fds.getFrameworks();
    }
}
