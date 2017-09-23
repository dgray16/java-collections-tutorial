package com.chnu.java.recursion;

import com.chnu.java.Dog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TreeIterationExample {

    public void treeIteration() {

        Dog frank = new Dog("Frank", Collections.singletonList(new Dog("Vlad")));
        Dog sarah = new Dog("Sarah");

        List<Dog> dogsCollection = Collections.singletonList(new Dog("Bob", Arrays.asList(frank, sarah)));

        /* Lets print all dogs in generation */
        for (Dog dog : dogsCollection) {
            System.out.println(dog.getName());
            iterateThroughDogs(dog);
        }

        System.out.println("End");
    }

    private void iterateThroughDogs(Dog parent) {
        for (Dog child : parent.getChildren()) {
            System.out.println("- ".concat(child.getName()));
            iterateThroughDogs(child);
        }
    }

}
