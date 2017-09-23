package com.chnu.java;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class Dog {

    private Integer size;

    private String name;
    private List<Dog> children;

    public Dog(int size) {
        this.size = size;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, List<Dog> children) {
        this.name = name;
        this.children = children;
    }

    public List<Dog> getChildren() {
        return nonNull(this.children) ? this.children : new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Size: = ".concat(size.toString());
    }


}
