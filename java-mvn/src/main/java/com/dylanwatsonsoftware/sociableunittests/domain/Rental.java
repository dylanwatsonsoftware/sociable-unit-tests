package com.dylanwatsonsoftware.sociableunittests;

import lombok.Data;

@Data
public class Rental {
  Movie movie;
  private int daysRented;

  public double getCharge() {
    return movie.getCharge(daysRented)
  }

  public int getPoints() {
    return movie.getPoints(daysRented);
  }

  public String getLineItem() {
    return movie.getTitle() + " " + getCharge();
  }
}
