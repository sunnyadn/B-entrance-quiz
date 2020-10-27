package com.thoughtworks.capability.gtb.entrancequiz.model;

import java.util.List;

public class Group {

    public Group(List<Member> members) {
        this.members = members;
    }

    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
