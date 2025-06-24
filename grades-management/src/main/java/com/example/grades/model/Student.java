package com.example.grades.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private Map<String, List<Grade>> gradesByModule = new HashMap<>();

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(String moduleName, Grade grade) {
        gradesByModule.computeIfAbsent(moduleName, k -> new ArrayList<>()).add(grade);
    }

    public List<Grade> getGrades(String moduleName) {
        return gradesByModule.getOrDefault(moduleName, new ArrayList<>());
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}
