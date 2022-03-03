package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three-digit number: ");
        int num = sc.nextInt();
        int result1 = num / 100; // 321 / 100 = 3,21 since it's int result will be 3
        int result2 = (num / 10) % 10; // (321 / 10) % 10 = 32,1 % 10 = 2,1 since it's int result will be 2
        int result3 = num % 10; // 321 % 10 = 1
        System.out.println(result1 +  "," + result2 + "," + result3);
    }
}
