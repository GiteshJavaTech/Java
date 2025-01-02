package com.java.practices.tsc.hac;

import java.util.Scanner;

public class FizzBuzzTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(fizzBuzz(n));
    }

    public static int fizzBuzz(int n){
        for (int i=1; i<=n; i++) {
            if (i%5==0 && i%3==0)
                System.out.println("FizzBuzz");
            else if (i%3 == 0)
                System.out.println("Buzz");
            else if (i%5==0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
        return n;
    }
}
