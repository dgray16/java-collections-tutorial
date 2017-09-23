package com.chnu.java.collections.map;

import com.chnu.java.Dog;

import java.util.LinkedHashMap;

public class LinkedHashMapSample {

    public void linkedHashMap() {

        LinkedHashMap<Integer, Dog> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(0, new Dog(0));
        linkedHashMap.put(1, new Dog(1));
        linkedHashMap.put(5, new Dog(5));
        linkedHashMap.put(2, new Dog(2));

        /* Rehashing */
        for (int i = 10; i < 20; i++) {
            linkedHashMap.put(i, new Dog(i));
        }

        System.out.println("End");
    }

}
