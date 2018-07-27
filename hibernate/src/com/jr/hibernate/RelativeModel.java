package com.jr.hibernate;

public class RelativeModel {
    private String name;
    private String birth;

    public RelativeModel(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }
    public String getBirth() {
        return birth;
    }
}
