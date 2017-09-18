package com.chnu.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListSample {

    public void arrayList() {
        arrayListAdd();
        arrayListRemove();
        arrayListSort();
        notGenericArrayList();
    }

    private void arrayListAdd() {
        List<Integer> ourIntegerList = new ArrayList<>();

        ourIntegerList.add(1);
        ourIntegerList.add(1, 2);
        ourIntegerList.addAll(Arrays.asList(3, 4));
        ourIntegerList.addAll(4, Arrays.asList(5, 6));

        ourIntegerList.add(null);

        List<Integer> listToAdd = Arrays.asList(8, 9);
        List<Integer> anotherListToAdd = Arrays.asList(10, 11);

        /* Regular for each */
        for (Integer integer : listToAdd) {
            ourIntegerList.add(integer);
        }

        /* Stream API */
        anotherListToAdd.stream()
                .forEach(ourIntegerList::add);

        ourIntegerList.set(6, 7);

        ourIntegerList.clear();

        System.out.println("End");
    }

    private void arrayListRemove() {
        List<Integer> ourIntegerList = new ArrayList<>();

        ourIntegerList.addAll(Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99));

        ourIntegerList.remove(ourIntegerList.size() - 1);
        ourIntegerList.remove(Integer.valueOf(88));
        ourIntegerList.removeAll(Arrays.asList(77, 66));

        /* Regular for each */
        for (Integer value : Arrays.asList(33, 44)) {
            ourIntegerList.remove(value);
        }

        /* Stream API */
        Arrays.asList(11, 22).stream()
                .forEach(ourIntegerList::remove);

        /* Java 8 */
        ourIntegerList.removeIf(Predicate.isEqual(55));

        System.out.println("End");
    }

    private void arrayListSort() {
        arrayListAscendingSort();
        arrayListDescendingSort();
    }

    private void arrayListAscendingSort() {
        List<Integer> ourIntegerList = new ArrayList<>();
        ourIntegerList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        List<Integer> anotherIntegerList = new ArrayList<>();
        anotherIntegerList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        List<Integer> yetAnotherOneIntegerList = new ArrayList<>();
        yetAnotherOneIntegerList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        /* Regular anonymous class */
        ourIntegerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(finalList);

        /* Java 8 */
        anotherIntegerList.sort(Integer::compareTo);
        yetAnotherOneIntegerList.sort(((o1, o2) -> o1.compareTo(o2)));
        integerList.sort((Comparator.naturalOrder()));

        System.out.println("End");
    }

    private void arrayListDescendingSort() {
        List<Integer> ourIntegerList = new ArrayList<>();
        ourIntegerList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        List<Integer> anotherIntegerList = new ArrayList<>();
        anotherIntegerList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        List<Integer> yetAnotherOneIntegerList = new ArrayList<>();
        yetAnotherOneIntegerList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        /* Regular anonymous class */
        ourIntegerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        Collections.reverse(finalList);


        /* Java 8 */
        anotherIntegerList.sort( ((Comparator<Integer>) (Integer::compareTo)).reversed() );
        yetAnotherOneIntegerList.sort(((o1, o2) -> o2.compareTo(o1)));
        integerList.sort((Comparator.reverseOrder()));

        System.out.println("End");
    }

    private void notGenericArrayList() {
        List ourList = new ArrayList();

        ourList.add(1);
        ourList.add("One");
        ourList.add(1L);
        ourList.add(1D);
        ourList.add(true);

        List copyList = new ArrayList();

        copyList.add(1);
        copyList.add("One");
        copyList.add(1L);
        copyList.add(1D);
        copyList.add(true);


        /* SubList */
        List subList = ourList.subList(2, 4);

        /* Contains */
        boolean containsIntegerOne = ourList.contains(1);
        boolean containsLongOrDoubleOne = ourList.containsAll(subList);

        /* Equals */
        boolean listEqualsCopy = ourList.equals(copyList);
        boolean listLinksEquals = ourList == copyList;

        /* Get */
        final Integer stringIndex = ourList.indexOf("One");
        String stringValue = (String) ourList.get(stringIndex);

        /* Empty */
        boolean ourListEmpty = ourList.isEmpty();

        /* ToArray */
        Object[] objects = ourList.toArray();

        System.out.println("End");
    }

}
