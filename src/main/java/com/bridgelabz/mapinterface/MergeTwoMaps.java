package com.bridgelabz.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        // Example input maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merging the maps
        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        // Printing the result
        System.out.println(mergedMap);
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> resultMap = new HashMap<>(map1);

        for (String key : map2.keySet()) {
            resultMap.put(key, resultMap.getOrDefault(key, 0) + map2.get(key));
        }

        return resultMap;
    }
}
