package com.example.grades.model;

import java.util.ArrayList;
import java.util.List;

public class CourseModule {
    private String name;
    private List<ClassGroup> classes = new ArrayList<>();

    public CourseModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addClass(ClassGroup classGroup) {
        classes.add(classGroup);
    }

    public List<ClassGroup> getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return name;
    }
}
