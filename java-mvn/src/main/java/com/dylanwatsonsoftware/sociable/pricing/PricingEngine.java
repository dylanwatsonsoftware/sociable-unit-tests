package com.dylanwatsonsoftware.sociable.pricing;

public class PricingEngine {
    public double calculate(Price price, int qty) {
        return price.cost()
            + price.cost() * percent(price.marginPercent()) * (1 - Math.min(1, qty / price.bestQty()));
    }

    public static double percent(double price) {
        return price / 100;
    }
}
