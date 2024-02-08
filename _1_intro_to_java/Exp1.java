package _1_intro_to_java;

import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();

        int remainder1 = num % 10;
        int remainder2 = num % 100;
        int remainder3 = num % 1000;

        System.out.println(remainder1);
        System.out.println(remainder2);
        System.out.println(remainder3);

    }
}
