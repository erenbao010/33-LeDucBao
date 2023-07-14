package java_core_day3;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        // Hash set can
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        // get size of hash set
        int size = numbers.size();
        System.out.println(size);
        // remove element
        // Hashset will display the elements in a different order, which could be [40, 10] or [10, 40]
        boolean remove = numbers.remove(30);
        System.out.println(remove);
        System.out.println("update hashset"+ numbers);
        for(int number : numbers){
            System.out.println(number);
        }
        // check if hashset contain a specific element
        boolean contains = numbers.contains(10);
        System.out.println(contains);

        // clear all element in hashset
        numbers.clear();
        System.out.println(numbers.size());
    }
}
