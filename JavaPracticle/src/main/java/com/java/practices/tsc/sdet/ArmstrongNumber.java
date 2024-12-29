package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
         a number that is equal to the sum of cubes of its digits
         ex- 153
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Enter number is " + msg(num));
    }

    public static String msg(int n){
        String msg = "Armstrong";
        int temp = n;
        int div = 1,arm =0;
        while (n>0){
            div = n%10;
            arm = arm + div*div*div;
            n = n/10;
        }
        if (temp != arm) {
            msg = "not a Armstrong!!";
        }
        return msg;
    }
}
