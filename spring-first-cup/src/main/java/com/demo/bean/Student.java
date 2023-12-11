package com.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name = "John";
    private String school = "ISM";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", school='" + school + '\'' +
                '}';
    }

}
