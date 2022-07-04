package com.ownproject.steps;

import com.ownproject.models.request.CreateCustomerRequest;
import io.cucumber.java.en.Given;

public class CreateCustomerSteps extends CucumberSpringConfiguration {

    @Given("Create customer request is sent, supplemented with \"{}\" income last year")
    public void sendCreateCustomerRequest(Double income) {
        CreateCustomerRequest request = createCustomerSampler.createCustomerWithIncome(income);
        scenarioContext.setCreateCustomerRequest(request);
        scenarioContext.setCreateCustomerResponse(taxCalculationService.createCustomer(request));
    }


}
