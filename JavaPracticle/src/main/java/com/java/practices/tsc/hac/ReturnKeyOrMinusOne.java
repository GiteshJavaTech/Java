package com.java.practices.tsc.hac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReturnKeyOrMinusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the size : ");
        int size = sc.nextInt();
        sc.nextLine();

        Map<Integer,String> studentMap = new HashMap<>();
        for (int i=0; i<size; i++){
            String studentIdAndName = sc.nextLine();
            String[] students = studentIdAndName.split(" ");
            studentMap.put(Integer.parseInt(students[0]),students[1]);
        }
        System.out.print("Enter the search key : ");
        int searchId = sc.nextInt();
        if (studentMap.containsKey(searchId))
            System.out.println(studentMap.get(searchId));
        else
            System.out.println("-1");
    }
}
