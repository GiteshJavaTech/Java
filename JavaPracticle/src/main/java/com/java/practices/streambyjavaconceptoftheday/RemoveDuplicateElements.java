package com.java.practices.streambyjavaconceptoftheday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    /*
        How do you remove duplicate elements from a list using Java 8 streams?
        uniqueStrngs >>[Java, Python, C#, Kotlin]
        Unique numbers: [1, 2, 3, 4, 5]
        Unique fruits: [apple, orange, banana]
        UniqueAnimals >> [Cow, Cat, Dog, Elephant, Horse]
        startsWithCAnimal >> [Cow, Cat]
    */
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> uniqueStrngs = listOfStrings.stream()
                .distinct() // Remove duplicates
                .collect(Collectors.toList());
        System.out.println("uniqueStrngs >>" + uniqueStrngs);


        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());
        System.out.println("Unique numbers: " + uniqueNumbers);

        // Example 2: String List
        List<String> fruits = Arrays.asList("apple", "orange", "apple", "banana");
        List<String> uniqueFruits = fruits.stream()
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());
        System.out.println("Unique fruits: " + uniqueFruits);

        List<String> animals = Arrays.asList("Cow","Cat","Dog","Elephant","Horse","Cat");

        List<String> uniqueAnimals = animals.stream().distinct().collect(Collectors.toList());
        System.out.println("UniqueAnimals >> " + uniqueAnimals);

        List<String> startsWithCAnimal =
                uniqueAnimals.stream().filter(name->name.startsWith("C")).collect(Collectors.toList());
        System.out.println("startsWithCAnimal >> " + startsWithCAnimal);


    }
}

// https://www.javaguides.net/2024/02/java-8-program-to-remove-duplicate-elements-from-list.html#:~:text=Use%20Java%208%20Stream%20to,the%20list%20with%20duplicates%20removed.
// https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/