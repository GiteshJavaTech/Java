package com.java.practices.tsc.sdet;

import java.util.Scanner;

public class ReverseEachWordCharString {
    public static void main(String[] args) {
        /*
        ip - "Hello java world"
        op - olleH avaj dlrow
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word as string : ");
        String str = sc.nextLine();
        System.out.println("Reverse of each word string : " + reverseOfString(str)); // each character in word
        System.out.println("Reverse of word : " + revOfWord(str)); // reverse of each word in string
    }

    public static String reverseOfString(String inputString){
        String[] words = inputString.split(" ");

        String reverseString = "";
        for (int i=0; i<words.length; i++){

            String word = words[i];
            String wordRev = "";
            for (int j=word.length()-1; j>=0; j--){
                wordRev = wordRev+word.charAt(j);
            }
            reverseString = reverseString+wordRev + " ";
        }
        return reverseString;
    }

    /*
    Reverse of word
    ip - "Hello Java"
    op - "Java Hello"
     */

    public static String revOfWord(String str){
        String[] words = str.split(" ");
        String reverseWords = "";

        for (int i=words.length-1; i>=0; i--){
            String word = words[i];
            reverseWords = reverseWords+word + " ";
        }
        return reverseWords;
    }
}
