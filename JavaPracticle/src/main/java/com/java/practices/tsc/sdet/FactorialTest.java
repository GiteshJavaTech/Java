package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        /*
        5 = 5*4*3*2*1 = 120
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter for Factorial : ");
        int n = sc.nextInt();

        /*int i=0, fact = 1;
        while (n>0){
            i++;
           fact = fact*i;
            System.out.print(fact+ " * ");
            n--;

        }*/
        int fac = 1;
        for (int i=1; i<=n; i++)
            fac = fac*i;
        System.out.println(fac);


    }
}
