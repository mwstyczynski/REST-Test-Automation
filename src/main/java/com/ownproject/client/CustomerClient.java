package com.ownproject.client;

import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static io.restassured.http.ContentType.JSON;

@Slf4j
@Component
public class CustomerClient {

    private String baseUrl = "https://localhost:8080/";

    public Response createCustomer(Object request) {
        log.info("Create Customer request is sent");
        return given(requestSpecification)
                .basePath(baseUrl)
                .contentType(JSON)
                .when()
                .body(request)
                .post("/user");
    }

    public Response getCustomer(UUID id) {
        log.info("Customer data is requested for");
        return given(requestSpecification)
                .basePath(baseUrl)
                .contentType(JSON)
                .param(id.toString())
                .when()
                .get("/user");
    }

}
