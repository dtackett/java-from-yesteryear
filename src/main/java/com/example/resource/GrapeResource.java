package com.example.resource;

import com.example.data.Grape;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("/grape")
public class GrapeResource {

    private static List<Grape> grapes = new ArrayList<Grape>();

    @GET
    @Produces("application/json")    
    public List<Grape> get() {
        return grapes;
    }

    @GET
    @Path("/{index}")
    @Produces("application/json")
    public Grape get(@PathParam("index") int index) {
        return grapes.get(index);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Grape post(Grape grape) {
        grapes.add(grape);
        return grape;
    }

}