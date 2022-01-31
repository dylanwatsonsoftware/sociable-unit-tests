package com.dylanwatsonsoftware.sociable.pricing;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PricingController {

    private final PricingService pricingService;

    @GetMapping("/:id")
    public double calculatePrice(String id, int quantity) {
        return pricingService.price(id, quantity);
    }

}