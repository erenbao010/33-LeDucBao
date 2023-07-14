package java_core;

public class java_task {
    public static void main(String [] args) {
    for (int i =1; i<=10; i++){
        if (i==3){
            continue;
        }
        System.out.println(i);
    }
    int [] numbers = {3,2,5,21,6,5};
    int result = java_task.findFirstElement(numbers);
        System.out.println("Result "+  result);
    }
    public static int findFirstElement(int [] numbers) {
        for (int num : numbers) {
            if (num %2 ==0){
                return num;
            }
        } return -1;
    }
}
