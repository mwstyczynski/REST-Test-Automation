package com.ownproject.models.response;

import com.ownproject.models.Customer;
import com.ownproject.models.enums.Threshold;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

public class GetCustomerResponse {

    protected final Customer customer;
    protected final Double calculatedTax;
    protected final Threshold establishedThreshold;

}
