package com.chnu.java.collections.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetSample {

    public void treeSet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(9, 5, 1, 10, 2));

        /* Next greater or same value */
        Integer ceiling = treeSet.ceiling(3);

        /* Next less or same value */
        Integer floor = treeSet.floor(3);

        Integer higher = treeSet.higher(9);
        Integer lower = treeSet.lower(2);

        SortedSet<Integer> setBelowFive = treeSet.headSet(5);

        treeSet.add(-1);
        treeSet.pollFirst();

        /* Not including toKey */
        SortedSet<Integer> fromTwoTillNineSubset = treeSet.subSet(2, 9);

        /* Greater and equals */
        SortedSet<Integer> tailSet = treeSet.tailSet(9);

        /* Orders set */
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();

        Integer first = treeSet.first();
        Integer last = treeSet.last();


        System.out.println("End");
    }


}
