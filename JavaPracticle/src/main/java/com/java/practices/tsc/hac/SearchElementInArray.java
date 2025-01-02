package com.java.practices.tsc.hac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the search number : ");
        int k = sc.nextInt();

        System.out.println(findNumber(arr, k));

    }

    public static String findNumber(List<Integer> arr, int k){
        String result = "NO";

        for (int item : arr){
            if (k == item){
                result = "YES";
                break;
            }
        }
        return result;
    }
}
