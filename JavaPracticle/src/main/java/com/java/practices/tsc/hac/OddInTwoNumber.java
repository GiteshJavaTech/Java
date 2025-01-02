package com.java.practices.tsc.hac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddInTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int l = sc.nextInt();
        System.out.print("Enter second number : ");
        int r = sc.nextInt();

        System.out.println("Result : " + oddNumbers(l,r));
    }

    public static List<Integer> oddNumbers(int l, int r){
        List<Integer> output = new ArrayList<>();

        if (l%2 == 0)
            l = l+1;
        while (l<=r){
            output.add(l);
            l = l + 2;
        }
        return output;
    }
}
