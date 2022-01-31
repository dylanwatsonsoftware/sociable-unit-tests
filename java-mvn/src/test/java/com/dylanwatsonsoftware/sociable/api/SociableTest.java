package com.dylanwatsonsoftware.sociable.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class SociableTest {

    @Mock
    RentalRepository rentalRepository;

    @Test
    public void shouldBeFaster() throws Exception {
        assertThat(new RentalService(rentalRepository).rentals()).isNotEmpty();
    }
}
