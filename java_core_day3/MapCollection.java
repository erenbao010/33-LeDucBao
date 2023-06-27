package java_core_day3;


import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args){
        Map<String, Integer> studentId = new HashMap<>();
        studentId.put("Bao", 10);
        studentId.put("Dep",100);
        studentId.put("Trai",1000);
        int size = studentId.size();
        System.out.println(size);
        int Baoid= studentId.get(1);
        System.out.println(Baoid +"bAOID");
        // check if map containt specific key
        boolean constainKeyword=studentId.containsKey("Trai");
        System.out.println(constainKeyword+ " is");
        // iterage over the element map
        for (Map.Entry<String,Integer>entry:studentId.entrySet()){
            String name = entry.getKey();
            int id = entry.getValue();
            System.out.println("NAME"+ name + "Value"+ id);

        }
        // remove element from map
        Integer removeId = studentId.remove(1);
        System.out.println(removeId+ "Remove key = 1");
        // update key value of map
        System.out.println(studentId+ "Map is contain");
        // clear all element from map
        studentId.clear();
        System.out.println(studentId);


    }
}
