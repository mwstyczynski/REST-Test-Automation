package com.ownproject.scenario;

import com.ownproject.models.request.ChangeIncomeRequest;
import com.ownproject.models.request.CreateCustomerRequest;
import com.ownproject.models.response.ChangeIncomeResponse;
import com.ownproject.models.response.CreateCustomerResponse;
import com.ownproject.models.response.GetCustomerResponse;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ScenarioContext {

    private Double income;

    private CreateCustomerRequest createCustomerRequest;
    private CreateCustomerResponse createCustomerResponse;
    private GetCustomerResponse getCustomerResponse;
    private ChangeIncomeRequest changeIncomeRequest;
    private ChangeIncomeResponse changeIncomeResponse;

}
