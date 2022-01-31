package com.dylanwatsonsoftware.sociable.api;

import com.dylanwatsonsoftware.sociable.domain.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
@AllArgsConstructor
public class RentalService {

    RentalRepository rentalRepository;

    public List<Rental> rentals() {
        return rentalRepository.findAll();
    }

    public Rental rental(String id) {
        return rentalRepository.getById(id);
    }
}
