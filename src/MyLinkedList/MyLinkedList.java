package MyLinkedList;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Empty list:" + list);

        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println("Added list:" + list);

        list.add(2, "Ten");
        System.out.println("List added with index 2:" + list);


        list.remove(2);
        System.out.println("List remove with index 2:" + list);
        list.addFirst("Zero");
        list.addLast("Twenty");
        System.out.println("List added first and last:" + list);

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Eight");
        list2.add("Nine");
        System.out.println("Second list:" + list2);

        list.addAll(list2);
        System.out.println("Add the second list into the first: " + list);
        list2.addAll(0, list);
        System.out.println("Add the first list into the second with index:" + list2);

        System.out.println("First element:" + list.getFirst());
        System.out.println("Last element:" + list.getLast());

        LinkedList<String> list3 = new LinkedList<String>();
        System.out.println(list3);
        //for the empty lists, only peek functions return null, else go tp NoSuchElementException
    }
}
