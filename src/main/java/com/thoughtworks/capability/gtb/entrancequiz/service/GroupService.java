package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Group;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService {
    private final List<Group> groups = new ArrayList<>();

    public List<Group> getGroups() {
        return groups;
    }

    public List<Group> refreshGroups() {
        groups.clear();

        return groups;
    }
}
