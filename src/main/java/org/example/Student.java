package org.example;
import java.util.Comparator;
import java.util.logging.Logger;

class Student implements Comparator<Student> {
    String studentname;
    int studentage;
    double studentgpa;
    static Logger l = Logger.getLogger("com.api.jar");

    Student() {
    }

    void setter(String name, int age, double gpa) {
        this.studentname = name;
        this.studentage = age;
        this.studentgpa = gpa;
    }

    String getter1() {
        return this.studentname;
    }

    int getter2() {
        return this.studentage;
    }

    double getter3() {
        return this.studentgpa;
    }


    public int compare(Student a, Student b) {
        return (int) ((int) a.studentgpa - b.studentgpa);
    }
}