package org.example;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int grade;

    private HashMap<String, Student> studentMap = new HashMap<>();
    public Student (String name, int grade){
        setName(name);
        setGrade(grade);
    }

    public HashMap increase(HashMap<String, Student> studends){
        for (String key : studends.keySet()){
            studends.get(key).setGrade(studends.get(key).getGrade() + studends.get(key).getGrade()/10);
        }
        return studends;
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
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("El valor debe de estar entre 0 y 100");
        }
    }
}
