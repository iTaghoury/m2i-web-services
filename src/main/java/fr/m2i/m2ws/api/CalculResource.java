package fr.m2i.m2ws.api;

import fr.m2i.m2ws.exception.NegativeFactException;
import fr.m2i.m2ws.util.Math;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/calculatrice")
public class CalculResource {
    @GET
    @Path("/add/n1={n1}-n2={n2}")
    public String add(@PathParam("n1") int n1, @PathParam("n2") int n2) {
        return String.format("%d + %d = %d", n1, n2, Math.add(n1, n2));
    }
    @GET
    @Path("/sub/n1={n1}-n2={n2}")
    public String sub(@PathParam("n1") int n1, @PathParam("n2") int n2) {
        return String.format("%d - %d = %d", n1, n2, Math.sub(n1, n2));
    }
    @GET
    @Path("/mult/n1={n1}-n2={n2}")
    public String mult(@PathParam("n1") int n1, @PathParam("n2") int n2) {
        return String.format("%d * %d = %d", n1, n2, Math.mult(n1, n2));
    }
    @GET
    @Path("/div/n1={n1}-n2={n2}")
    public String div(@PathParam("n1") int n1, @PathParam("n2") int n2) {
        return String.format("%d / %d = %f", n1, n2, Math.div(n1, n2));
    }
    @GET
    @Path("/fact/n={n}")
    public String fact(@PathParam("n") int n) {
        try {
            return String.format("%d! = %d", n, Math.fact(n));
        } catch (NegativeFactException e) {
            return e.getMessage();
        }
    }
}
