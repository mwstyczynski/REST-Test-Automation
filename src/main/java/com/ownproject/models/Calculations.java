package com.ownproject.models;

import com.ownproject.models.enums.Threshold;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculations {

    // [minor] Maybe to be set as part of Response Bodies

    private Double calculatedTax;
    private Threshold threshold;

}
