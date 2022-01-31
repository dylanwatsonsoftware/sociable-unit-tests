package com.dylanwatsonsoftware.sociable.pricing;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRepository extends JpaRepository<Price, String> {
}
