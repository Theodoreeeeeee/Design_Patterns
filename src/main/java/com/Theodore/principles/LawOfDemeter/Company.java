package com.Theodore.principles.LawOfDemeter;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public Company(String name) {
        this.name = name;
    }
}
