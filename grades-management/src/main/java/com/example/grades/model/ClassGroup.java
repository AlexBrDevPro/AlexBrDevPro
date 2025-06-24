package com.example.grades.model;

import java.util.ArrayList;
import java.util.List;

public class ClassGroup {
    private String name;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public ClassGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return name;
    }
}
