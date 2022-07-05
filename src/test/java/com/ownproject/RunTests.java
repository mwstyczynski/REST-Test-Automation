package com.ownproject;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "json:target/cucumber-report.json"},
        tags = "@taxCalculation"
)


public class RunTests {

    @BeforeClass
    public static void setup() {
        System.setProperty("spring.profiles.active", "local");
    }

}
