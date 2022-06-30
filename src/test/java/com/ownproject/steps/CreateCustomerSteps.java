package com.ownproject.steps;

import com.ownproject.client.CustomerClient;
import com.ownproject.models.request.CreateCustomerRequest;
import com.ownproject.models.response.CreateCustomerResponse;
import com.ownproject.models.samplers.CreateCustomerSampler;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateCustomerSteps {

    @Autowired
    CreateCustomerSampler createCustomerSampler;

    @Autowired
    CustomerClient customerClient;

    @Given("Create customer request is sent, supplemented with \"{}\" income last year")
    public CreateCustomerResponse sendCreateCustomerRequest(Double income) {
        CreateCustomerRequest request = createCustomerSampler.createCustomerWithIncome(income);
        customerClient.createCustomer(request);
        return CreateCustomerResponse.builder().build();
    }

}
