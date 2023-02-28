package fr.m2i.m2ws.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;


@Path("/calcul")
public class HelloResource {
    @GET
    @Produces("text/html")
    public String hello() {
        return "<h1>Hello, World!</h1>";
    }

    @GET
    @Path("/add")
    @Produces("text/html")
    public String add() {
        return String.format("<h1>1 + 1 = %d</h1>", 1+1);
    }

    @GET
    @Path("/sous")
    @Produces("text/html")
    public String sous() {
        return String.format("<h1>3 - 2 = %d", 3-2);
    }

    @GET
    @Path("/mult")
    @Produces("text/html")
    public String mult() {
        return String.format("<h1>4 * 2 = %d", 4*2);
    }
}