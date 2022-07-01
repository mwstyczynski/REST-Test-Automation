package com.ownproject.configuration;

import com.ownproject.scenario.ScenarioContext;
import io.cucumber.spring.ScenarioScope;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class TestConfiguration {

    @Bean
    @ScenarioScope
    public ScenarioContext scenarioContext() {
        return new ScenarioContext();
    }

}
