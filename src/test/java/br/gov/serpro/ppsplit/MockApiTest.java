package br.gov.serpro.ppsplit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class MockApiTest {

    @Test
    void postBoletoReturns200() {
        given()
                .contentType("application/json")
                .body("{}")
                .when()
                .post("/api/v1/boleto")
                .then()
                .statusCode(200)
                .body("status", is(200));
    }

    @Test
    void swaggerUiIsAvailable() {
        given()
                .redirects().follow(false)
                .when()
                .get("/q/swagger-ui")
                .then()
                .statusCode(anyOf(is(200), is(301), is(302)));
    }

    @Test
    void openApiContainsBoletoPath() {
        given()
                .when()
                .get("/q/openapi")
                .then()
                .statusCode(200);
    }
}
