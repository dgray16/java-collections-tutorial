package com.chnu.java.collections;

public class Dog {

    private Integer size;

    public Dog(int size) {
        this.size = size;
    }

    public String toString() {
        return "Size: = ".concat(size.toString());
    }

}
