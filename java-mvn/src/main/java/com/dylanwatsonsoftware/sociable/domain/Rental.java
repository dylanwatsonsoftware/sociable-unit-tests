package com.dylanwatsonsoftware.sociableunittests.domain;

import lombok.Data;

@Data
public class Rental {
    String id;

    Movie movie;

    int daysRented;

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    public int getPoints() {
        return movie.getPoints(daysRented);
    }

    public String getLineItem() {
        return movie.getTitle() + " " + getCharge();
    }
}
