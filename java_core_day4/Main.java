package java_core_day4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("def");
        list2.add("ijk");


        // Thêm các phần tử vào ArrayList
        myList.add(1);
        myList.add(2);
        myList.add(4);
        // find max
        int max = findMaxNumber(myList);
        System.out.println("Max"+max);
        Set<Integer> uniqueNumbers = new HashSet<>(myList);
        System.out.println("Danh sach ban dau = " + myList);

        int sum = sum_array_list(myList);
        System.out.println("Sum=" + sum);
//        int hashSetList = hashSetDemo(myList);
        System.out.println("List hashSet is=" + uniqueNumbers);
        LinkedList<String> linkedList = reverse_list();
        System.out.println("List" + linkedList);

        // bai 7
        Map<String, Integer> students = new HashMap<>();
        students.put("Bao",10);
        students.put("Bao1",103);
        students.put("Bao2",102);
        System.out.println("List student "+ students);

        // hash map
        HashMap<Integer,String> findElement = new HashMap<>();
        findElement.put(1,"abbc");
//        findElement.containsKey()
        System.out.println(dedupe("aabcc")); // ["b"]
        System.out.println(dedupe("aabbcc")); // []
        //bai 3
        String input1 = "aaabcc";
        String input2 = "xyz";
        HashMap<String, Integer> result1 = wordCounter(input1);
        System.out.println("So ky tu"+result1);

        HashMap<String, Integer> result2 = wordCounter(input2);
        System.out.println("So ky tu"+ result2);
        // bai 11
        ArrayList<String> new_arr_list = new ArrayList<>();
//        new_arr_list.add("a");
//        new_arr_list.add("42");
//        new_arr_list.add("ac");
//        System.out.println("List ban dau"+ new_arr_list);
        System.out.println("List copy:" +copyArrayList(new_arr_list));
        ArrayList<String> arr14 = new ArrayList<>();
        System.out.println("Check "+ check_arr_list(arr14));
        // bai 13
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Thêm các phần tử vào LinkedList (hoặc bạn có thể không thêm gì)
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);

        int elementToCount = 1; // Phần tử cần tìm số lần xuất hiện
        int count = count_linked_list(list, elementToCount);

        System.out.println("Số lần xuất hiện của phần tử " + elementToCount + " là: " + count);

    }

    public static int sum_array_list(ArrayList<Integer> numbers) {
        // Khởi tạo một đối tượng ArrayList rỗng
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int hashSetDemo(ArrayList<Integer> myList) {

        return 0;
    }

    public static LinkedList<String> reverse_list() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ijk");
        linkedList.add("def");
        linkedList.add("abc");
        Collections.reverse(linkedList);
        return linkedList;
    }
    public static int findMaxNumber(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
//    public static void dedupe(String str) {
//
public static List<Character> dedupe(String str) {
    HashMap<Character, Integer> charCountMap = new HashMap<>();
//string a = "abc";[a,b,c]
    // Đếm số lần xuất hiện của các ký tự trong chuỗi
    for (char c : str.toCharArray()) {
        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }

    List<Character> uniqueChars = new ArrayList<>();

    // Tạo danh sách các ký tự không trùng nhau
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
        if (entry.getValue() == 1) {
            uniqueChars.add(entry.getKey());
        }
    }

    return uniqueChars;
}
    // bai 2
//    public static  HashMap<String, List<Integer>> classifyPrime(List<Integer> nums) {
//        HashMap<String, List<Integer>> songuyento = new HashMap<>();
//        songuyento.put("1",[1,2,34,5,6]);
//    }
    public static HashMap<String, Integer> wordCounter(String word) {
        HashMap<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String character = String.valueOf(word.charAt(i));
            counter.put(character, counter.getOrDefault(character, 0) + 1);
        }
        return counter;
    }
    // bai 11 viet mot method sao chep arraylist
    public static ArrayList<String> copyArrayList(ArrayList<String> list){
        ArrayList<String> arrList = new ArrayList<>(list);
        arrList.add("abc");
        arrList.add("123");
        System.out.println("List ban dau" + arrList);
        ArrayList<String> new_arr = new ArrayList<>(arrList);

        return new_arr;

    }
    public static ArrayList<String> check_arr_list(ArrayList<String> list) {
        ArrayList<String> arrList = new ArrayList<>(list);
        arrList.add("abc");
        if (arrList.isEmpty()){
            System.out.println("Arr emty"+ arrList);
        } else {
            System.out.println("Not emty");
        }
        return arrList;
    }
    public static int count_linked_list(LinkedList<Integer> list, int element) {
        int count = 0;
        for (int el : list) {
            if (el == element) {
                count++;
            }
        }

        return count;
    }

}

