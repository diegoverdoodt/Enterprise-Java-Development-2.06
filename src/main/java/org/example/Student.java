package org.example;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int grade;

    private Map<String, Student> studentMap = new HashMap<>();
    public Student (String name, int grade){
        setName(name);
        setGrade(grade);
    }

    public Map<String, Student> increase(Map<String, Student> a){
        for (Student student : a.values()){
            student.grade = (int) (grade * 1.1);
        }
        return a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
