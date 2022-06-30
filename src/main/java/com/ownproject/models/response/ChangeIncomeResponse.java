package com.ownproject.models.response;

import com.ownproject.models.enums.Threshold;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor

public class ChangeIncomeResponse {

    protected final UUID customerId;
    protected final String message;
    protected final Double updatedTaxCalculation;
    protected final Threshold updatedThreshold;

}
