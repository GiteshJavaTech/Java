package com.java.practices.tsc.string;

public class CountCharaterInString {
    public static void main(String[] args) {
        /*
        string -- apple
             ip - p
             op - 2
         */
        String str = "apple";
        char ch = 'p';
        int count = 0;
        for (int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == ch)
                ++count;
        }

        System.out.println("Count of " + ch + " : " + count);
    }
}
