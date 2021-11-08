package com.dylanwatsonsoftware.sociable.api;

import com.dylanwatsonsoftware.sociable.domain.Rental;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    @GetMapping("/")
    public List<Rental> rentals() {
        return rentalService.rentals();
    }

    @GetMapping("/:id")
    public Rental rental(@PathVariable String id) {
        return rentalService.rental(id);
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, World";
    }

}


