package com.chnu.java.collections.set;


import com.chnu.java.Dog;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample {

    public void hashSet() {
        Set<Dog> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(new Dog(i));
        }

        System.out.println("End");
    }

}
