package com.ownproject.model.samplers;

import com.ownproject.model.Customer;
import com.ownproject.model.request.CreateCustomerRequest;
import lombok.Builder;

import java.time.LocalDate;

import static com.ownproject.model.enums.Actor.owner;
import static java.time.Month.APRIL;

@Builder(toBuilder = true)
public class CreateCustomerSampler {

    public CreateCustomerRequest createCustomerWithIncome(Double income) {
        return CreateCustomerRequest.builder()
                .actor(owner)
                .customer(Customer.builder()
                        .firstName("Adam")
                        .lastName("Whatever")
                        .dateOfBirth(LocalDate.of(1992, APRIL, 23))
                        .countryOfResidence("Great Britain")
                        .incomeLastYear(income)
                        .build())
                .build();

    }
}
