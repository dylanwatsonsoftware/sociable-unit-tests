package com.dylanwatsonsoftware.sociable.pricing;

import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PricingTest {

    PricingController pricingController(PricingRepository repo) {
        return new PricingController(
            new PricingService(
                new PricingEngine(),
                repo,
                new ProductClient()
            )
        );
    }

    @Test
    public void testPricing() {
        PricingRepository mockPricingRepo = mock(PricingRepository.class);
        PricingController controller = pricingController(mockPricingRepo);

        Price price = new Price("123", "Cake", 20, 5, 20.00, 10);

        when(mockPricingRepo.findById("123")).thenReturn(Optional.of(price));

        assertThat(controller.calculatePrice("123", 1))
            .isCloseTo(24.00, within(0.02));

        assertThat(controller.calculatePrice("123", 10))
            .isCloseTo(20.00, within(0.02));
    }
}
