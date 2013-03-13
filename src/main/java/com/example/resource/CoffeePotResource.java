package com.example.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/coffee-pot")
public class CoffeePotResource {
  
  @GET
  @Produces("text/plain")
  public Response getDrink(@DefaultValue("large") @QueryParam("size")String size,
                           @DefaultValue("drip") @QueryParam("type")String type) {
    if ("tea".equalsIgnoreCase(type)) {
      return Response.status(418).build();
    }

    return Response.ok().entity("Here is your " + size + ", " + type + " coffee").build();
  }
}