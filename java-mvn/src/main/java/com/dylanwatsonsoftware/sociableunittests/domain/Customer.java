package com.dylanwatsonsoftware.sociableunittests.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();
}
