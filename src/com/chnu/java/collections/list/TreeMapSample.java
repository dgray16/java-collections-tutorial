package com.chnu.java.collections.list;

import com.chnu.java.Dog;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

    public void treeMap() {

        TreeMap<Integer, Dog> treeMap = new TreeMap<>();

        for (int i = 5; i > 0; i--) {
            treeMap.put(i, new Dog(i));
        }

        System.out.println("End");
    }

}
