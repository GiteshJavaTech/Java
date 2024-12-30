package com.java.practices.selfstring.practicle;

public class CountOccurrencesOfSubstring {
    public static void main(String[] args) {
        /*
        str1 = "TPisTPareTPamTP", str2 = "TP";
        op - Count of occurrences of a substring recursively are: 4
         */

        /*
        String str = "helloslkhellodjladfjhello";
        String findStr = "hello";
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(findStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        System.out.println(count);
        */

        //String str = "hellohellohello";
        //String substring = "hello";
        //String str = "helloslkhellodjladfjhello";
        //String substring = "hello";

        String str = "TPisTPareTPamTP", substring = "TP";

        int result = countSubstringOccurrences(str, substring);
        System.out.println("The substring '" + substring + "' occurs " + result + " times.");
        }

    // Method to count occurrences of a substring in a given string
    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0;  // To store the count of occurrences
        int strLength = str.length();
        int subLength = substring.length();
        if (subLength > strLength) {
            return count;
        }

        for (int i = 0; i <= strLength - subLength; i++) {
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != substring.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }

        return count;
    }
}

//https://www.tutorialspoint.com/count-occurrences-of-a-substring-recursively-in-java#
//https://stackoverflow.com/questions/767759/find-the-number-of-occurrences-of-a-substring-in-a-string#:~:text=You%20can%20find%20the%20number,of%20elements%20in%20the%20stream.