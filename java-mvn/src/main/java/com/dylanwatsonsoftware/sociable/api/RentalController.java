package com.dylanwatsonsoftware.sociable.api;

import com.dylanwatsonsoftware.sociable.domain.Rental;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalController {

    @GetMapping("/")
    public Rental rental() {
        return new Rental();
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, World";
    }

}
