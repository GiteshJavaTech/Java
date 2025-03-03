package com.java.practices.streambyjavaconceptoftheday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningTheStrings {
    /* Q-6
        joinedString >>[Facebook, Twitter, YouTube, WhatsApp, LinkedIn]
    */
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println("joinedString >>" + joinedString);
    }
}

//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/