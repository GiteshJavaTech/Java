package com.java.practices.streambyjavaconceptoftheday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaximumAndMinimum {
    /* Q-8

     */
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum Element : "+max);

        Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Manimum Element : "+min);


    }
}


//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/