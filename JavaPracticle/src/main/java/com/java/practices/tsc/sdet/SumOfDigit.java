package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        /*
        ip - 12345
        op - 15
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int sumOfDigit = 0;
        while (n>0){
            int temp = n%10;
            sumOfDigit = sumOfDigit+temp;
            n = n/10;
        }

        System.out.println("Sum of the digits : " + sumOfDigit);
    }
}
