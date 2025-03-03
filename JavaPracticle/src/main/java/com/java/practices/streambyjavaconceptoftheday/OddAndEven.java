package com.java.practices.streambyjavaconceptoftheday;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddAndEven {
    /*
        Given a list of integers, separate odd and even numbers?
        output :-
            [18, 42, 32, 14, 56]
            [71, 21, 67, 95, 87]
     */
    public static void main(String[] args){
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        /*
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
        for (Map.Entry<Boolean, List<Integer>> entry : entrySet){
            System.out.println("--------------");

            if (entry.getKey()){
                System.out.println("Even Numbers");
            }
            else{
                System.out.println("Odd Numbers");
            }

            System.out.println("--------------");
            List<Integer> list = entry.getValue();

            for (int i : list){
                System.out.println(i);
            }
        }
        */
        Map<Boolean, List<Integer>> partitions = listOfIntegers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> evens = partitions.get(true);
        System.out.println(evens);
        List<Integer> odds = partitions.get(false);
        System.out.println(odds);

    }
}

//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/
