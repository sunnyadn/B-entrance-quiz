package com.thoughtworks.capability.gtb.entrancequiz.model;

public class Member implements Comparable<Member> {
    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return this.id - o.id;
    }
}
