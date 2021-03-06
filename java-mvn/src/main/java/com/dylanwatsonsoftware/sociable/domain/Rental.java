package com.dylanwatsonsoftware.sociable.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
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
