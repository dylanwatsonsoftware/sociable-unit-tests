package com.dylanwatsonsoftware.sociable.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Customer {
    String id;
    String name;
    List<Rental> rentals;
}
