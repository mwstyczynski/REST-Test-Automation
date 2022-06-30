package com.ownproject.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)

public class CreateCustomerResponse {

    protected final UUID customerId;
    protected final String message;

}
