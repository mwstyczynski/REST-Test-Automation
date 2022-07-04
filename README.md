## Repository Content

The following repository contains a Testing Framework Blueprint related with previously created [REST and Spring
Boot](https://github.com/mwstyczynski/REST-and-Spring-Boot) repository. Once the application is running it enables test
execution and report generation.

## Test Strategy

The expected final effect of prepared framework is generation of the `report.html` file containing results of test executions.
Particular endpoints are tested along with E2E flow. The heart of the framework is Scenario Context file which enables
the transfer of request and response data from one call to another. Basic idea is to send a request to particular
endpoint and validate the response as well as data returned by get endpoint for particular customer.

### Feature Tests

Two particular test features are implemented:

- tests of particular endpoint, as validation of request and response
    - validation of responses
- set of tax calculation checks based on boundary value examples 
- end to end flow with examples, to validate that tax calculations and establishments are calculated properly
    - on customer creation
    - on income update

    + response of income change call should return the same calculations as get endpoint called after the operation


## Tech Stack

* Core technologies: Java, Maven, Spring Boot
* Rest:   Rest Assured, Lombok (builders)
* Test organization and reporting: Cucumber, Gherkin

## Local Setup Requirements and Code Style

- install Gherkin and Cucumber for Java plugins
- build and/or reload Maven project with dependencies
- install Java JVM on your local machine; add to .path
- change indent to 4 chars for better readability
 ##### And most importantly- run `Application.java` from [REST and Spring Boot](https://github.com/mwstyczynski/REST-and-Spring-Boot) reposiroty to enable local endpoints


## Materials
[baeldung.com: Cucumber Spring Integration](https://www.baeldung.com/cucumber-spring-integration)
[baeldung.com: Cucumber Rest API Testing](https://www.baeldung.com/cucumber-rest-api-testing)
[cucumber.io: Documentation](https://cucumber.io/)
