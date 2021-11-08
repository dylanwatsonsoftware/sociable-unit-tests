package com.dylanwatsonsoftware.sociable.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class SociableTest {

    @Test
    public void shouldBeFaster() throws Exception {
        new RentalController().rental();
        new RentalController().greeting();
    }

    @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
    public static class HttpRequestTest {

        @LocalServerPort
        private int port;

        @Autowired
        private TestRestTemplate restTemplate;

        @Test
        public void greetingShouldReturnDefaultMessage() throws Exception {
            assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/greeting",
                String.class)).contains("Hello, World");
        }
    }

    @WebMvcTest
    public static class WebLayerTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void shouldReturnDefaultMessage() throws Exception {
            this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, World")));
        }
    }

    @SpringBootTest
    @AutoConfigureMockMvc
    public static class TestingWebApplicationTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void shouldReturnDefaultMessage() throws Exception {
            this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, World")));
        }
    }
}
