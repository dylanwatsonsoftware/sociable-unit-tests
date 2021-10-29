package com.dylanwatsonsoftware.sociableunittests;

import java.util.List;
import lombok.Data;

@Data
public class Customer {
  private String name;
  private List<Rental> rentals = new ArrayList<Rental>();
}
