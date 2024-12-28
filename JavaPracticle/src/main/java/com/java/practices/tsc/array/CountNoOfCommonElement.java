package com.java.practices.tsc.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNoOfCommonElement {
    public static void main(String[] args) {

        /*
            int[] arr1 = {1,3,4,5,6,8,9};
            int[] arr2 = {3,7,0,5,2,1,8};

            Op
            Common element : [1,3,5,8]
         */
        int[] arr1 = {1,3,4,5,6,8,9};
        int[] arr2 = {3,7,0,5,2,1,8};

        System.out.println("Array1 :" + Arrays.toString(arr1));
        System.out.println("Array2 :" + Arrays.toString(arr2));

        System.out.println("Common element : " + findcommonElemt(arr1,arr2));


    }

    public static List<Integer> findcommonElemt(int[] arr1, int[] arr2){
        List<Integer> element = new ArrayList<>();
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                if (arr1[i] == arr2[j])
                    if (!element.contains(arr1[i]))
                        element.add(arr1[i]);
            }
        }
        return element;
    }
}
