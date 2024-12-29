package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        /*
        ip - 121
        op - palindrom

        ip - 123
        op - 321 not palindrom
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Entered number is " + msg(n));
    }
     public static String msg(int n) {
        String msg = "Palindrome";
        int orignal = n;
        int rev = 0,temp = 1;
        while (n>0){
            temp = n%10;
            rev = rev*10+temp;
            n = n/10;
        }
        if (orignal != rev)
            msg = "Not a Palindrom !!";
        return msg;
     }
}
