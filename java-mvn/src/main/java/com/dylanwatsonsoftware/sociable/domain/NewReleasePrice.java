package com.dylanwatsonsoftware.sociable.domain;

public class NewReleasePrice extends Price {

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getPoints(int daysRented) {
        if (daysRented > 1) return 2;
        return 1;
    }
}
