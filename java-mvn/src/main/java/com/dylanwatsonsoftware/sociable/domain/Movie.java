package com.dylanwatsonsoftware.sociable.domain;

import com.dylanwatsonsoftware.sociable.domain.price.ChildrensPrice;
import com.dylanwatsonsoftware.sociable.domain.price.NewReleasePrice;
import com.dylanwatsonsoftware.sociable.domain.price.Price;
import com.dylanwatsonsoftware.sociable.domain.price.RegularPrice;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    final String id;
    final String title;
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

    public enum Type {
        REGULAR,
        NEW_RELEASE,
        CHILDREN
    }
}
