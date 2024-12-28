package com.java.practices.tsc.string;

public class Plindrom {
    public static void main(String[] args) {
        String original = "levele";
        System.out.println("Original string :" + original);

        boolean palindrom = checkPalindrom(original, stringReverse(original));
        if (palindrom)
            System.out.println("Palindrom");
        else
            System.out.println("Not a Palindrom");
    }

    public static boolean checkPalindrom (String original, String reverse){
        boolean flag = false;
        if (original.equals(reverse))
            flag = true;
        return flag;
    }

    public static String stringReverse(String original){
        String reverse = "";
        for (int i=original.length()-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        return reverse;
    }
}
