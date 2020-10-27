package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    private final List<Group> groups = new ArrayList<>();

    public List<Group> getGroups() {
        return groups;
    }
}
