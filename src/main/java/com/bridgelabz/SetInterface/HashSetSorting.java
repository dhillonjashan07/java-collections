package com.bridgelabz.SetInterface;

import java.util.*;

public class HashSetSorting {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> sortedList = new ArrayList<>(numbers);


        Collections.sort(sortedList);


        System.out.println(sortedList); // Output: [1, 3, 5, 9]
    }
}
