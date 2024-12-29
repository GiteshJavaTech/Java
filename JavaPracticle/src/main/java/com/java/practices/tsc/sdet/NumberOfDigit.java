package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        /*
            ip - 12345
            op - 5
         */
        /*int n = 0, a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener num : ");
        n = sc.nextInt();
        if (n<0)
            n = n*-1;
        else if(n == 0)
            n = 1;
        while (n>0){
            n = n/10;
            a++;
        }
        System.out.print("No of Digit : " + a);
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        int count = 0;
        while (n>0){
            count++;
            n = n/10;
        }
        System.out.println("Entered no of Digit is : " + count);

    }
}
