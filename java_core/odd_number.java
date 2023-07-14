package java_core;

public class odd_number {
    public short sum(int a, int b){
        return (short) (a+b);
    }
    public static void main (String[] args){
        odd_number sum2 = new odd_number();
        Short result2 = sum2.sum(10, 4);
        System.out.println(result2.getClass());
    }
}
