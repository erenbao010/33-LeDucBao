package java_core;

public class TypeofVar {
    public static void main (String [] args){
        Integer obj = 100;
        String obj2 = "abc";
        Byte obj3 = 12;
        Character obj4 = 'a';
        Long obj5 = 122000000000L;
        Double obj6 = 12.202222;
        Float obj7 = 12.002f;
        System.out.println("Kiểu dữ liệu của obj là: " + obj.getClass() +Integer.MAX_VALUE);
        System.out.println("Kiểu dữ liệu của obj là: " + obj2.getClass());
        System.out.println("Kiểu dữ liệu của obj là: " + obj3.getClass());
        System.out.println("Kiểu dữ liệu của obj là: " + obj4.getClass());
        System.out.println("Kiểu dữ liệu của obj là: " + obj5.getClass());
        System.out.println("Kiểu dữ liệu của obj là: " + obj6.getClass());
        System.out.println("Kiểu dữ liệu của obj là: " + obj7.getClass());

    }
}
