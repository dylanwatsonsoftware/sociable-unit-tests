package com.dylanwatsonsoftware.sociable.api;

import com.dylanwatsonsoftware.sociable.domain.Rental;

import java.util.List;

import static java.util.Arrays.asList;

public class RentalService {
    public List<Rental> rentals() {
        return asList(new Rental());
    }

    public Rental rental(String id) {
        return new Rental().id(id);
    }
}
