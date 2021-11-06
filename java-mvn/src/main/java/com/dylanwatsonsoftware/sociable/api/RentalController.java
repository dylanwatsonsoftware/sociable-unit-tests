package com.dylanwatsonsoftware.sociable.api;

import com.dylanwatsonsoftware.sociable.domain.Rental;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Controller
@Path("/")
public class RentalController {

    @GET
    @Path("/")
    public Rental rental() {
        return new Rental();
    }

    @GET
    @Path("/greeting")
    public String greeting() {
        return "Hello, World";
    }

}
