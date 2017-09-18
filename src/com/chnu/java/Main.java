package com.chnu.java;

import com.chnu.java.collections.list.ArrayListSample;
import com.chnu.java.collections.list.LinkedListSample;
import com.chnu.java.collections.map.HashMapSample;
import com.chnu.java.collections.map.LinkedHashMapSample;
import com.chnu.java.collections.set.HashSetSample;
import com.chnu.java.collections.set.LinkedHashSetSample;
import com.chnu.java.collections.set.TreeSetSample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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

        System.out.println("End");
    }

}
