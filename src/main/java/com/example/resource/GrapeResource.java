package com.example.resource;

import com.example.data.Grape;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/grape")
public class GrapeResource {

    @GET
    public Grape get() {
        return new Grape();
    }

}