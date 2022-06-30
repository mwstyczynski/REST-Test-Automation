package com.ownproject.models.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Actor {

    ACCOUNTANT,
    OWNER,
    @JsonProperty("tax reporter")
    TAX_REPORTER

}
