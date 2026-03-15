package com.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Course course;

    public void display() {
        System.out.println("Student: Vivek");
        course.courseName();
    }
}