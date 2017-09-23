package com.chnu.java.collections.map;

import com.chnu.java.collections.Dog;

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

        hashMap.put(2, new Dog(2));

        /* Regular for each */
        for (Map.Entry<Integer, Dog> integerDogEntry : hashMap.entrySet()) {
            integerDogEntry.setValue(new Dog(9));
            break;
        }

        /* Java 8 Stream */
        Map.Entry<Integer, Dog> integerDogEntry = hashMap.entrySet().stream()
                .findFirst()
                .orElseThrow(RuntimeException::new);

        integerDogEntry.setValue(new Dog(10));

        /* Regular for each */
        for (Map.Entry<Integer, Dog> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        /* Java 8 */
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

        /* Demonstration of rehashing */
        for (int i = 10; i < 20; i++) {
            hashMap.put(i, new Dog(i));
        }

        System.out.println("End");
    }

}
