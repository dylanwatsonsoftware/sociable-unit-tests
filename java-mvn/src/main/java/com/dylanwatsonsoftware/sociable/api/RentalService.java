package com.dylanwatsonsoftware.sociable.api;

import com.dylanwatsonsoftware.sociable.domain.Rental;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class RentalService {
    public List<Rental> rentals() {
        return asList(new Rental());
    }

    public Rental rental(String id) {
        return new Rental().id(id);
    }
}
