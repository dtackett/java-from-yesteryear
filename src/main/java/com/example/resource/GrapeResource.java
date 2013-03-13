package com.example.resource;

import com.example.data.Grape;

import javax.ws.rs.*;

@Path("/grape")
public class GrapeResource {

    @GET
    @Produces("application/json")    
    public Grape get() {
        return new Grape();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Grape post(Grape grape) {
        grape.setWrangled(true);

        return grape;
    }

}