package com.dylanwatsonsoftware.sociable.pricing;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PricingService {

    PricingEngine pricingEngine;
    PricingRepository pricingRepository;
    ProductClient productClient;

    public double price(String id, int quantity) {
        // TODO maybe should be called PriceTable?
        Price price = pricingRepository.findById(id).orElseThrow();
        return pricingEngine.calculate(price, quantity);
    }
}
