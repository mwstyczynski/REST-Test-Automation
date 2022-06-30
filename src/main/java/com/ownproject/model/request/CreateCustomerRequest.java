package com.ownproject.model.request;

import com.ownproject.model.Customer;
import com.ownproject.model.enums.Actor;
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
