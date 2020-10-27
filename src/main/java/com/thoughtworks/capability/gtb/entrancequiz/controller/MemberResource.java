package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import com.thoughtworks.capability.gtb.entrancequiz.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("members")
public class MemberResource {

    private final MemberService memberService = new MemberService();

    @GetMapping
    public List<Member> getMembers() {
        return memberService.getMembers();
    }
}
