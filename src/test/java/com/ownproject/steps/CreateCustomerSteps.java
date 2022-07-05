package com.ownproject.steps;

import com.ownproject.client.TaxCalculationClient;
import com.ownproject.models.request.CreateCustomerRequest;
import com.ownproject.models.samplers.CreateCustomerSampler;
import com.ownproject.scenario.ScenarioContext;
import com.ownproject.service.TaxCalculationService;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class CreateCustomerSteps {

//    @Autowired
//    ScenarioContext scenarioContext;
//
//    @Autowired
//    TaxCalculationService taxCalculationService;
//
//    @Autowired
//    CreateCustomerSampler createCustomerSampler;


    @Given("Create customer request is sent, supplemented with {string} income last year")
    public void sendCreateCustomerRequest(String income) {
        log.info("The income was set to {income} and Create Customer call was made", income);
//        CreateCustomerRequest request = createCustomerSampler.createCustomerWithIncome(Double.valueOf(income));
//        scenarioContext.setCreateCustomerRequest(request);
//        scenarioContext.setCreateCustomerResponse(taxCalculationService.createCustomer(request));
    }

}

// $FIXME: Find a way to connect other classes within Steps classes- having @Autowired annotations in...
//  $FIXME: ... CucumberSpringConfiguration will thrown cucumberBackendException: No test instance