package com.dylanwatsonsoftware.sociableunittests.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {
    String id;
    String name;
    List<Rental> rentals = new ArrayList<>();
}
