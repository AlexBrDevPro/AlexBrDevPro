package com.example.grades;

import com.example.grades.model.*;

public class App {
    public static void main(String[] args) {
        // Create system
        SchoolManagement system = new SchoolManagement();

        // Create course, module, class, teacher and students
        Course course = new Course("Computacion");
        CourseModule module = new CourseModule("Programacion");
        ClassGroup classA = new ClassGroup("A");
        Teacher teacher = new Teacher("Profesor Lopez");
        classA.setTeacher(teacher);

        Student alice = new Student("1", "Alice");
        Student bob = new Student("2", "Bob");

        classA.addStudent(alice);
        classA.addStudent(bob);

        module.addClass(classA);
        course.addCourseModule(module);
        system.addCourse(course);

        // Teachers assign grades
        teacher.assignGrade(alice, module.getName(), 9.5);
        teacher.assignGrade(bob, module.getName(), 7.0);

        // Print summary
        for (Course c : system.getCourses()) {
            System.out.println("Curso: " + c.getName());
            for (CourseModule m : c.getCourseModules()) {
                System.out.println("  Modulo: " + m.getName());
                for (ClassGroup cg : m.getClasses()) {
                    System.out.println("    Clase: " + cg.getName() + " - Profesor: " + cg.getTeacher());
                    for (Student s : cg.getStudents()) {
                        System.out.println("      Alumno: " + s + " notas: " + s.getGrades(m.getName()));
                    }
                }
            }
        }
    }
}
