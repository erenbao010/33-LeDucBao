package java_core_day3;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args ){
        Map<String, Integer> student = new HashMap<>();
        // add element Hashmap
        student.put("Bao",10);
        student.put("Dep", 100);
        student.put("Trai", 100);
        // set size student in hashmap
        int size = student.size();
        System.out.println("Size"+size);
        //Access element in hashmap
        Integer getStudent = student.get("Bao");
        System.out.println("Element get is"+ getStudent);
        // check if element in hashmap have specific key
        boolean contains = student.containsKey("Bao");
        boolean contains2 = student.containsValue(10);
        System.out.println("Student contains "+ contains + "+" + contains2);
        // iterage


    }
}
