package Sd_HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Smith",30);
        hashmap.put("Anderson", 31);
        hashmap.put("Lewis", 29);
        hashmap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashmap + "\n");



        Map<String,Integer> tree = new TreeMap<>();
        tree.put("Smith",30);
        tree.put("Anderson", 31);
        tree.put("Lewis", 29);
        tree.put("Cook", 29);
        System.out.println("Display entries in ascending order of key");
        System.out.println(tree);


        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
