package com.java.practices.tsc.hac;

import java.util.Scanner;

public class FrequencyOfGivenString {
    /*
        string -- apple
        ip - p
        op - 2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        System.out.print("Enter the character to find frequency : ");
        char ch = sc.next().charAt(0);

        System.out.print("Frequecy of character in string : " + frequecyCount(str, ch));
    }

    public static int frequecyCount(String str, char ch){
        int count = 0;
        for (int i=0; i<str.length()-1; i++)
            if (ch == str.charAt(i))
                ++ count;

        return count;
    }
}
