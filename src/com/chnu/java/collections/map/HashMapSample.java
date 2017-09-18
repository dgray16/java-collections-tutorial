package com.chnu.java.collections.map;

import com.chnu.java.Dog;

import java.util.HashMap;

public class HashMapSample {

    public void hashMap() {
        HashMap<Integer, Dog> hashMap = new HashMap<>();

        hashMap.put(1, new Dog(2));

        HashMap<Integer, Dog> valuesMap = new HashMap<>();
        valuesMap.put(1, new Dog(1));
        valuesMap.putIfAbsent(2, new Dog(2));

        hashMap.putAll(valuesMap);

        System.out.println("End");
    }

}
