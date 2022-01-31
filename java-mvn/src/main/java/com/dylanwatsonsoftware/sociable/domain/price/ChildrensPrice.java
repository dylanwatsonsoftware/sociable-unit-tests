package com.dylanwatsonsoftware.sociable.domain.price;

public class ChildrensPrice extends Price {

    @Override
    public double getCharge(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) amount += (daysRented - 3) * 1.5;
        return amount;
    }
}
