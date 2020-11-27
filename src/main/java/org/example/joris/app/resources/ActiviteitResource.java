package org.example.joris.app.resources;

import org.example.joris.app.domain.Framework;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/frameworks")
//@Transactional(Transactional.TxType.REQUIRED)
public class ActiviteitResource {

//    @PersistenceContext(unitName = "corona-app")
//    EntityManager em;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Framework> getFrameworks() {
        ArrayList<Framework> frameworks = new ArrayList<>();
        frameworks.add(new Framework(1, "Angular", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/800px-Angular_full_color_logo.svg.png", 10));
        frameworks.add(new Framework(2, "React", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/React-icon.svg/1024px-React-icon.svg.png", 7));
        return frameworks;
    }
}
