package com.java.practices.streambyjavaconceptoftheday;

import java.util.Arrays;
import java.util.List;

public class MultiplesOf5 {
    /* Q-7
        45
        15
        75
    */

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(n -> n%5==0).forEach(System.out::println);
        //listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
    }

}


//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/