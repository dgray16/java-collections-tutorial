package com.chnu.java.collections.set;

import com.chnu.java.Dog;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSample {

    public void linkedHashSet() {
        Set<Dog> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 10; i++) {
            linkedHashSet.add(new Dog(i));
        }

        System.out.println("End");
    }

}
