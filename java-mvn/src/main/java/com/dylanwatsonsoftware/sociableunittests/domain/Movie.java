package com.dylanwatsonsoftware.sociableunittests.domain;

import lombok.Data;

@Data
public class Movie {
    public enum Type {
        REGULAR,
        NEW_RELEASE,
        CHILDREN
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
