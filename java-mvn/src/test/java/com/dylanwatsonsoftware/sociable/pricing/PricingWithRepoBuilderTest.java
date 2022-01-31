package com.dylanwatsonsoftware.sociable.pricing;

import com.mmnaseri.utils.spring.data.dsl.factory.RepositoryFactoryBuilder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class PricingWithRepoBuilderTest {

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
        PricingRepository pricingRepo = RepositoryFactoryBuilder.builder().mock(PricingRepository.class);
        PricingController controller = pricingController(pricingRepo);

        Price price = new Price("123", "Cake", 20, 5, 20.00, 10);

        pricingRepo.save(price);

        assertThat(controller.calculatePrice("123", 1))
            .isCloseTo(24.00, within(0.02));

        assertThat(controller.calculatePrice("123", 10))
            .isCloseTo(20.00, within(0.02));
    }
}
