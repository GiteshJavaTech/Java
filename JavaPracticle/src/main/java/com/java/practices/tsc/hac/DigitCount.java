package com.java.practices.tsc.hac;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        /*
            ip - 11103345
            op -
            0: 1
            1: 3
            3: 2
            4: 1
            5: 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit : ");
        int n = sc.nextInt();

        int[] digiCount = new int[10];
        while (n != 0){
            int lasDigit = n%10;
            digiCount[lasDigit]++;
            n = n/10;
        }
        for (int i=0; i<digiCount.length; i++){
            if (digiCount[i] != 0)
                System.out.println(i + ": " + digiCount[i]);
        }

    }

}
