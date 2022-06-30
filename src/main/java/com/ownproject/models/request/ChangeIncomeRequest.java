package com.ownproject.models.request;

import com.ownproject.models.enums.Actor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeIncomeRequest {

    private Actor actor;
    private Double newIncomeValue;
    private String reason;

}
