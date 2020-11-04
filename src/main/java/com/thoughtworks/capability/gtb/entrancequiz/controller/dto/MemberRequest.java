package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

//TODO GTB-工程实践: + MemberRequest.java:6 单独提取了 MemberRequest，命名可以更具体，比如 CreateMemberRequest
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
