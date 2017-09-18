package com.chnu.java;

public class Dog {

    private Integer size;

    public Dog(int size) {
        this.size = size;
    }

    public String toString() {
        return "Size: = ".concat(size.toString());
    }

}
