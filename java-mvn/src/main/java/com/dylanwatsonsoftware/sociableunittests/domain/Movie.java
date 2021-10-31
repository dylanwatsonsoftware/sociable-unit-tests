package com.dylanwatsonsoftware.sociableunittests;

import lombok.Data;

@Data
public class Movie {
    public enum Type {
        REGULAR,
        NEW_RELEASE,
        CHILDREN,
        UNKNOWN;
    }

    private String title;
    Price price;

    private void setPriceCode(Movie.Type priceCode) {
        switch (priceCode) {
            case CHILDREN:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            default:
                throw new IllegalArgumentException("invalid price code");
        }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }
    public int getPoints(int daysRented) {
        return price.getPoints(daysRented);
    }
}

abstract class Price {
    abstract double getCharge(int daysRented);
    int getPoints(int daysRented) {
        return 1;
    }
}

class ChildrensPrice extends Price {
  
    @Override
    double getCharge(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) amount += (daysRented - 3) * 1.5;
        return amount;
    }
}

class RegularPrice extends Price {

    @Override
    public double getCharge(int daysRented) {
        double amount = 2;
        if (daysRented > 2) amount += (daysRented - 2) * 1.5;
        return amount;
    }
}

class NewReleasePrice extends Price {

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getPoints(int daysRented) {
        if (daysRented > 1) return 2;
        return 1;
    }
}