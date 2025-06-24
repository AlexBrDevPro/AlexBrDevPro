package com.example.grades.model;

public class Grade {
    private double value;

    public Grade(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%.2f", value);
    }
}
