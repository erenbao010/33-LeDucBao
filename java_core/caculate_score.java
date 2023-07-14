package java_core;

import java.util.Scanner;

public class caculate_score {
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        caculate_score calc = new caculate_score();
        int result = calc.add(10, 4);
        System.out.println(result);
        Scanner num = new Scanner(System.in);
        double score = (double) num.nextDouble();
        if (score < 20 && score >= 0) {
            System.out.println("E");
        } else if (score >= 20 && score < 40) {
            System.out.println("D");
        } else if (score >= 40 && score < 60) {
            System.out.println("C");
        } else if (score >= 60 && score < 80) {
            System.out.println("B");
        } else if (score >= 80 && score <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Nhap lai");
        }

    }

}

