package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();

        studentMap.put("Diego", new Student("Diego", 50));
        studentMap.put("Carlos", new Student("Carlos", 90));
        studentMap.put("Juan", new Student("Juan", 30));
        studentMap.put("Dani", new Student("Dani", 70));

        HashMap<String, Student> studentMap2 = new HashMap<>();
        //studentMap2.increase(studentMap);
    }


}
