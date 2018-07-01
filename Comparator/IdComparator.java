package com.dasharath.java;

import java.util.Comparator;

import com.dasharath.java.Employee;

public class IdComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Employee e1 = (Employee) o1;
            Employee e2 = (Employee) o2;
            if (e1.id > e2.id)
                return 1;
            else if (e1.id < e2.id)
                return -1;
            else
                return 0;
        }
    }


