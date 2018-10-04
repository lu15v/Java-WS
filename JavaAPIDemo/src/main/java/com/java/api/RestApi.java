/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

/**
 *
 * @author Cerebro
 */
//java.ws.rs
@Path("/hello")
public class RestApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{name}")
    public String sayHi(@PathParam("name") String name) {
        String jsonEx = "{hola;" + "'" + name + "'}";
        return jsonEx;
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHiFullName(@QueryParam("name") String name, @QueryParam("lastName") String lastName){
        return "<html> <title> hola" + name + "</title> <body> <h1> Hola! " +name + " " + lastName + "</h1></body></html>";
    }
}
