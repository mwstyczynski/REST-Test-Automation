package com.ownproject.steps;

import com.ownproject.client.TaxCalculationClient;
import com.ownproject.configuration.TestConfiguration;
import com.ownproject.models.samplers.CreateCustomerSampler;
import com.ownproject.scenario.ScenarioContext;
import com.ownproject.service.TaxCalculationService;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = TestConfiguration.class)
public class CucumberSpringConfiguration {

/*    @Autowired
    ScenarioContext scenarioContext;

    @Autowired
    TaxCalculationClient taxCalculationClient;

    @Autowired
    TaxCalculationService taxCalculationService;

    @Autowired
    CreateCustomerSampler createCustomerSampler;
    */

}
