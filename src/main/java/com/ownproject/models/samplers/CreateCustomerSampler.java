package com.ownproject.models.samplers;

import com.ownproject.models.Customer;
import com.ownproject.models.request.CreateCustomerRequest;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import static com.ownproject.models.enums.Actor.OWNER;
import static java.time.Month.APRIL;

@Component
@Builder(toBuilder = true)
public class CreateCustomerSampler {

    public CreateCustomerRequest createCustomerWithIncome(Double income) {
        return CreateCustomerRequest.builder()
            .actor(OWNER)
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
