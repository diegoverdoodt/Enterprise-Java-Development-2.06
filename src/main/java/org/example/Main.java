package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("Diego", new Student("Diego", 50));
        studentMap.put("Carlos", new Student("Carlos", 90));
        studentMap.put("Juan", new Student("Juan", 30));
        studentMap.put("Dani", new Student("Dani", 70));


    }
}
