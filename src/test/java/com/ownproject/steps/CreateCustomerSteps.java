package com.ownproject.steps;

import com.ownproject.models.request.CreateCustomerRequest;
import com.ownproject.models.response.CreateCustomerResponse;
import io.cucumber.java.en.Given;

public class CreateCustomerSteps extends StepsConfig {
    
    @Given("Create customer request is sent, supplemented with \"{}\" income last year")
    public void sendCreateCustomerRequest(Double income) {
        scenarioContext.setIncome(income);
        CreateCustomerRequest request = createCustomerSampler.createCustomerWithIncome(income);
        scenarioContext.setCreateCustomerRequest(request);
        CreateCustomerResponse response = taxCalculationClient.createCustomer(request).as(CreateCustomerResponse.class);
        scenarioContext.setCreateCustomerResponse(response);
    }


}
