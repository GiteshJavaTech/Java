package com.java.practices.streambyjavaconceptoftheday;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrays {
    /* Q-9 and 10
        [1, 2, 3, 4, 5, 7, 8, 9]
        [4, 2, 7, 1, 8, 3, 9, 5]
    */
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};

        int[] sortedEle = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(sortedEle));

        int[] arrayElement = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
        System.out.println(Arrays.toString(arrayElement));

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));


    }
}

//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/
