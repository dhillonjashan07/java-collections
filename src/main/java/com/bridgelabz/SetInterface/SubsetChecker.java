package com.bridgelabz.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SubsetChecker {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        for (Integer element : set1) {
            if (!set2.contains(element)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        if (isSubset(set1, set2)) {
            System.out.println("Set1 is a subset of Set2");
        } else {
            System.out.println("Set1 is not a subset of Set2");
        }
    }
}
