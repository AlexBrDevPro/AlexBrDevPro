package com.example.grades;

import com.example.grades.model.Course;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagement {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
