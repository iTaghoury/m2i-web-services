package fr.m2i.m2ws.api;
import fr.m2i.m2ws.model.Personne;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
@Path("/personne")
public class PersonneResource {
    @GET
    @Path("/get")
    @Produces("application/json")
    public Personne getPersonne() {
        return new Personne("Taghoury", "Idriss");
    }
}
