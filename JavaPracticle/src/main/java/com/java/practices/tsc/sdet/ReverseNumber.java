package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        /*
        Reverse of a number
        IP - 12345
        OP - 54321
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Reverse of a number : " + reverseNumber(num));


    }
    public  static int reverseNumber(int num){
        int rerverse = 0;
        while (num>0){
            int temp = num%10;
            rerverse = rerverse*10+temp;
            num = num/10;
        }
        return rerverse;
    }

}
