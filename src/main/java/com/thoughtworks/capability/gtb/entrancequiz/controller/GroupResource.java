package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Group;
import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("groups")
public class GroupResource {
    private final GroupService groupService = new GroupService();

    @GetMapping
    public List<Group> getGroups() {
        return groupService.getGroups();
    }
}
