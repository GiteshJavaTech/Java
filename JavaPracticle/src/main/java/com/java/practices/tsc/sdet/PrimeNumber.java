package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        Prime no is divisible by 1 and itself
        ex : 3, 5, 7, 11, 13, 17, 19, 23 ...
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for prime check : ");
        int num = sc.nextInt();

        System.out.println("Entered number is " + msg(num));
    }

    public static String msg(int num) {
        String msg = "Prime";
        for (int i=2; i<num/2; i++){
            if (num%i == 0){
                msg = "not a Prime";
            }
        }



        return msg;
    }
}
