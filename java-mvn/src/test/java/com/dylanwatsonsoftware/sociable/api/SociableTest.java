package com.dylanwatsonsoftware.sociable.api;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SociableTest {

    @Test
    public void shouldBeFaster() throws Exception {
        assertThat(new RentalService().rentals()).isNotEmpty();
    }
}
