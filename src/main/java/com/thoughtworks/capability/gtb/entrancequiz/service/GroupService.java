package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Group;
import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class GroupService {

    //TODO GTB-知识点: - GroupService.java:15 现在可以不用在这里写 @Autowired 了
    @Autowired
    public GroupService(MemberService memberService) {
        this.memberService = memberService;
    }

    MemberService memberService;

    private final List<Group> groups = new ArrayList<>();

    public List<Group> getGroups() {
        return groups;
    }

    public List<Group> refreshGroups() {
        groups.clear();

        List<Member> members = new ArrayList<>(memberService.getMembers());
        Collections.shuffle(members);

        final int GROUP_NUMBER = 6;
        int memberCount = members.size() / GROUP_NUMBER;
        int biggerGroupNumber = members.size() % GROUP_NUMBER;

        //TODO GTB-工程实践: * 尝试再简化以下下面的分配算法
        for (int i = 0; i < GROUP_NUMBER; i++) {
            List<Member> group = new ArrayList<>();
            for (int j = 0; j < memberCount; j++) {
                group.add(members.remove(0));
            }

            if (i < biggerGroupNumber) {
                group.add(members.remove(0));
            }

            //TODO GTB-完成度: - GroupService.java:49 group 里的 members 不需要排序
            Collections.sort(group);

            groups.add(new Group(group));
        }

        return groups;
    }
}
