package com.dasharath.java;

import java.util.*;

//What will happens if I make a ArrayList as final
//How make an ArrayList as unmodifiableList

public class ArrayListFinal {

    public static void main(String[] args) {
        final List list=new ArrayList();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);
       //list=new ArrayList(); can not do it because you made list final at line #11
        List list1=Collections.unmodifiableList(list); // With this line you can make a list as unmodifiableList
        list1.add(12);
        list.remove(3);
        System.out.println(list);

    }
}
