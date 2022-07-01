package com.ownproject.service;

import com.ownproject.client.TaxCalculationClient;
import com.ownproject.models.request.CreateCustomerRequest;
import com.ownproject.models.response.CreateCustomerResponse;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.Assertions.assertThat;

@Component
public class TaxCalculationService {

    @Autowired
    TaxCalculationClient taxCalculationClient;


    public CreateCustomerResponse createCustomer(CreateCustomerRequest request) {
        Response response = taxCalculationClient.createCustomer(request);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED.value());
        return response.as(CreateCustomerResponse.class);
    }

}
