package com.chnu.java.collections.map;

import com.chnu.java.Dog;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

    private static Dog zeroDog = new Dog(0);

    public void hashMap() {
        HashMap<Integer, Dog> hashMap = new HashMap<>();

        hashMap.put(1, new Dog(2));

        HashMap<Integer, Dog> valuesMap = new HashMap<>();
        valuesMap.put(1, new Dog(1));
        valuesMap.putIfAbsent(2, new Dog(2));

        hashMap.putAll(valuesMap);

        Dog dog = hashMap.get(2);

        boolean containsKey = hashMap.containsKey(2);

        Dog orDefault = hashMap.getOrDefault(3, new Dog(3));

        hashMap.remove(2);

        hashMap.replace(1, new Dog(3));

        Set<Integer> integerSet = hashMap.keySet();

        hashMap.compute(1, (key, value) -> new Dog(1));

        Collection<Dog> values = hashMap.values();

        /* Regular for each */
        for (Map.Entry<Integer, Dog> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        /* Java 8 */
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

        System.out.println("End");
    }

}
