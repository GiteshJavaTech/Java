package com.java.practices.streambyjavaconceptoftheday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    /* Q-5
            71.85
            56.98
            42.89
            33.78
            23.58
            21.12
            17.13
            12.45
    */
    public static void main(String[] args) {
        System.out.println("=====================================");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("=====================================");
        List<Integer> integerList1 = Arrays.asList(12, 23, 17, 42, 33, 71, 56, 21);
        integerList1.stream().sorted().forEach(System.out::println);

        System.out.println("=====================================");
        List<Integer> integerList2 = Arrays.asList(12, 23, 17, 42, 33, 71, 56, 21);
        integerList2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}


//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/