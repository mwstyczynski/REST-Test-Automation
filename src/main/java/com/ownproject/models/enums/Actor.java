package com.ownproject.models.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Actor {

    accountant,
    owner,
    @JsonProperty("tax reporter")
    taxReporter

}
