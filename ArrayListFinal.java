package com.dasharath.java;

import java.util.*;

public class ArrayListFinal {

    public static void main(String[] args) {
        final List list=new ArrayList();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);
        //list=new ArrayList(); can not do it
        List list1=Collections.unmodifiableList(list);
        list1.add(12);
        list.remove(3);
        System.out.println(list);

    }
}
