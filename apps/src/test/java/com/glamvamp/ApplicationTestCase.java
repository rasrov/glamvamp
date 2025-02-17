package com.glamvamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(classes = GlamvampApplication.class)
@AutoConfigureMockMvc
public abstract class ApplicationTestCase {

    @Autowired
    private WebTestClient webTestClient;

    protected void assertResponse(final String endpoint, final Integer expectedStatusCode, final String expectedResponse) {
        webTestClient.get().uri(endpoint).exchange().expectStatus().isEqualTo(expectedStatusCode).expectBody().json(expectedResponse);
    }

}
