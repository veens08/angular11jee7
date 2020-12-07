package org.example.joris.app.resources;

import org.example.joris.app.domain.Framework;
import org.example.joris.app.services.FrameworkDaoService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/frameworks")
@Transactional(Transactional.TxType.REQUIRED)
public class FrameworkResource {

    @Inject
    private FrameworkDaoService fds;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Framework> getFrameworks() {
        return fds.getFrameworks();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addFramework(Framework framework) {
        fds.save(framework);
    }
}
