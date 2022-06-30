package com.ownproject.models.request;

import com.ownproject.models.Customer;
import com.ownproject.models.enums.Actor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {

    private Actor actor;
    private Customer customer;

}
