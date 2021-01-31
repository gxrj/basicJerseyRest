package com.gxrj.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("teste")
public class HelloWorld {
    
    @GET
    @Produces("text/plain")
    public String sendMessage(){
        return "Rest api funcionando";
    }
}