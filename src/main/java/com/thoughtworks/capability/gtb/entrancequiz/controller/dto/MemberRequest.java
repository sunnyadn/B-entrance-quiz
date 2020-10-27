package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MemberRequest {
    @JsonCreator
    public MemberRequest(@JsonProperty("name") String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
