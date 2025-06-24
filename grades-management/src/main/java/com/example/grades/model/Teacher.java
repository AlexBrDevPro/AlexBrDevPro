package com.example.grades.model;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignGrade(Student student, String moduleName, double value) {
        student.addGrade(moduleName, new Grade(value));
    }

    @Override
    public String toString() {
        return name;
    }
}
