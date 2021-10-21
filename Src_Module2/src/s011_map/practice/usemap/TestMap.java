package s011_map.practice.usemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("dong", 23);
        hashmap.put("du", 22);
        hashmap.put("na", 20);
        System.out.println("display hashmap");
        System.out.println(hashmap);

//use treemap
        Map<String, Integer> treeMap = new TreeMap<>(hashmap);
        System.out.println("display treemap");
        System.out.println(treeMap);

//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashmap);
//        System.out.println("display linkedhashmap");
//        System.out.println(linkedHashMap);


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
