package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        /*
        ip - Apple
        op - elppa
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Reverse of string : " + revStr(str));
    }

    public static String revStr(String string){
        String reverse = "";
        for (int i = string.length()-1; i>=0; i--) {
            reverse = reverse + string.charAt(i);
        }
        return reverse;
    }
}
