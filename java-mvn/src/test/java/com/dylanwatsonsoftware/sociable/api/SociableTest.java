package com.dylanwatsonsoftware.sociable.api;

import org.junit.jupiter.api.Test;

public class SociableTest {

    @Test
    public void shouldBeFaster() throws Exception {
        new RentalController().rental();
        new RentalController().greeting();
    }
}
