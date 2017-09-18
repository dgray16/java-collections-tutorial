package com.chnu.java.collections.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListSample {

    public void linkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addAll(Arrays.asList(1, 2, 3));

        linkedList.addFirst(0);
        linkedList.addLast(4);

        Integer first = linkedList.getFirst();
        Integer last = linkedList.getLast();

        /* Same as getFirst(), got from Deque */
        Integer element = linkedList.element();

        /* Same as add(),  got from Queue*/
        linkedList.offer(5);
        linkedList.offerFirst(-1);
        linkedList.offerLast(6);

        /* Almost the same as getFirst(), no exception */
        Integer peekValue = linkedList.peek();
        Integer peekFirst = linkedList.peekFirst();
        Integer peekLast = linkedList.peekLast();

        /* Get and remove */
        Integer polledValue = linkedList.poll();
        Integer polledFirst = linkedList.pollFirst();
        Integer polledLast = linkedList.pollLast();

        /* AddFirst() */
        linkedList.push(-1);

        /* RemoveFirst() */
        linkedList.pop();

        /* RemoveFirst() */
        linkedList.addFirst(-2);
        linkedList.removeFirst();

        linkedList.add(2);
        linkedList.removeFirstOccurrence(2);

        linkedList.add(3);
        linkedList.removeLastOccurrence(3);

        /* Remove last */
        linkedList.add(-3);
        linkedList.removeLast();

        System.out.println("End");
    }

}
