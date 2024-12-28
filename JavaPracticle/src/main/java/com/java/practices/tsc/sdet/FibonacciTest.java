package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class FibonacciTest {
    public static void main(String[] args) {
        // fibonacci series : 0 1 1 2 3 5 8 13 ...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range for Fibonacci series : ");
        int n = sc.nextInt();

        int first = 0, second = 1, next;

        for (int i =0; i<=n; ++i){
            System.out.print(first + ", ");
            next = first + second;
            first = second;
            second = next;

        }
        /*int i=1;
        while (i <= n) {
            System.out.print(first + ", ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
            i++;
        }*/
    }
}
