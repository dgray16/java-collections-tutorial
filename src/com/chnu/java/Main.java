package com.chnu.java;

import com.chnu.java.collections.list.ArrayListSample;
import com.chnu.java.collections.list.LinkedListSample;
import com.chnu.java.collections.list.TreeMapSample;
import com.chnu.java.collections.map.HashMapSample;
import com.chnu.java.collections.map.LinkedHashMapSample;
import com.chnu.java.collections.set.HashSetSample;
import com.chnu.java.collections.set.LinkedHashSetSample;
import com.chnu.java.collections.set.TreeSetSample;
import com.chnu.java.json.JsonExample;
import com.chnu.java.recursion.TreeIterationExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Why List = realization and not ArrayList = realization? */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList = new LinkedList<>();
        integerList.add(2);
        /* But... */
        ((LinkedList<Integer>) integerList).getFirst();

        new ArrayListSample().arrayList();
        new LinkedListSample().linkedList();

        new HashSetSample().hashSet();
        new LinkedHashSetSample().linkedHashSet();
        new TreeSetSample().treeSet();

        new HashMapSample().hashMap();
        new LinkedHashMapSample().linkedHashMap();
        new TreeMapSample().treeMap();

        new JsonExample().jsonExample();
        new TreeIterationExample().treeIteration();

        System.out.println("End");
    }

}
