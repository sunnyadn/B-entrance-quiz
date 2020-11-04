package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private int currentIndex = 1;
    //TODO GTB-工程实践: - MemberService.java:12 可以把List<Member> members封装成 MemberRepository。Group 那边同理。
    private final List<Member> members = new ArrayList<>();


    public MemberService() {
        addMember("成吉思汗");
        addMember("鲁班七号");
        addMember("太乙真人");
        addMember("钟无艳");
        addMember("花木兰");
        addMember("雅典娜");
        addMember("芈月");
        addMember("白起");
        addMember("刘禅");
        addMember("庄周");
        addMember("马超");
        addMember("刘备");
        addMember("哪吒");
        addMember("大乔");
        addMember("蔡文姬");
    }

    public List<Member> getMembers() {
        return members;
    }

    public void addMember(String name) {
        Member member = new Member(currentIndex, name);
        members.add(member);
        currentIndex++;
    }
}
