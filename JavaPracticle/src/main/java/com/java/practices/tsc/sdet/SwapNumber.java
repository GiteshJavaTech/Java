package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        /*
        first = 10
        second = 20
        op
        first = 20
        second = 10
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = scanner.nextInt();
        System.out.print("Enter second number : ");
        int second = scanner.nextInt();

        first = first + (second=first);

        System.out.println("First :" + first + ", Second :" + second);


    }
}
