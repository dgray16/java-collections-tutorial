package com.chnu.java.json;

import com.chnu.java.Dog;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class JsonExample {

    public void jsonExample() {
        Map<Integer, Dog> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new Dog(i));
        }

        Gson gson = new Gson();
        String s = gson.toJson(map);

        System.out.println("End");
    }

}
