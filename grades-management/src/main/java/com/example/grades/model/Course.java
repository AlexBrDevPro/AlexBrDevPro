package com.example.grades.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<CourseModule> modules = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCourseModule(CourseModule module) {
        modules.add(module);
    }

    public List<CourseModule> getCourseModules() {
        return modules;
    }

    @Override
    public String toString() {
        return name;
    }
}
