package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Entered number is :" +checkOddEven(num));
    }

    public static String checkOddEven(int num){
        String msg = "Odd";
        if (num%2 == 0)
            msg = "Even";
        return msg;
    }
}
