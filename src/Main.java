
import Model.Person;
import MyList.MyArrayList;
import MyList.MyLinkedList;
import MyList.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * @author HELLO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person("Per1", 22);
        Person person2 = new Person("Per2", 18);
        Person person3 = new Person("Per3", 21);
        Person person4 = new Person("Per4", 17);
        Person person5 = new Person("Per5", 20);


        MyArrayList<Person> list = new MyArrayList<Person>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person2);
        System.out.println(list.lastIndexOf(person2));
        MyArrayList<Person> list2 = (MyArrayList<Person>) list.subList(0, 3);
        System.out.println(list2.contains(person5));

        for (Person person : list2) {
            System.out.println(person.getName());
        }

        MyLinkedList<Person> ll = new MyLinkedList<Person>();
        ll.add(person1);
        ll.add(person2);
        ll.add(person3);
        ll.add(person4);
        ll.add(person5);
        System.out.println("Linked list:");
        for (Person person : ll) {
            System.out.println(person);
        }
    }

}
