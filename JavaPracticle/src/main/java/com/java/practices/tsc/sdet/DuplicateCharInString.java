package com.java.practices.tsc.sdet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharInString {
    public static void main(String[] args) {
        /*
            Enter the string : ramayan
            Result : {a=3, r=1, y=1, m=1, n=1}
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("Result : " + charCout(str));

    }
    public static Map<Character, Integer> charCout(String str){
        Map<Character, Integer> map = new HashMap<>();

        for (int i=str.length()-1; i>=0; i--){
            if (map.containsKey(str.charAt(i))){
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            } else {
                map.put(str.charAt(i),1);
            }
        }
        return map;
    }
}
