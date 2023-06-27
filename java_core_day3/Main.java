package java_core_day3;

import java.util.*;


public class Main {
    public static void main (String[] args){
        // create collection [arraylist]
        Collection<  Integer> numbers = new LinkedList<>();
        List<String> fruits = new ArrayList<>();
        Set <String> languages = new HashSet<>();
        languages.add("Italia");
        languages.add("Viet Nam");
        languages.add("Thai Lan");
        int size3 = languages.size();
        boolean remove_language = languages.remove(2);
        System.out.println(remove_language+ " Remove Thai Lan");
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("WaterMelon");
        int size = fruits.size();
        System.out.println(size);
        fruits.set(2, "Banana");
        System.out.println(fruits);
        int size2 = numbers.size();
        System.out.println(size2);
        // check if collection empty
        boolean empty = numbers.isEmpty();
        System.out.println(empty);
        System.out.println("Elenemnt");
        for (int number: numbers){
            System.out.println(number);
        }
        // remove element in collection
        boolean remove = numbers.remove(20);
        System.out.println(remove +" Remove is");
        numbers.remove(0);
        System.out.println(numbers);

    }
}
