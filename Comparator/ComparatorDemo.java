package com.dasharath.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        Employee employee1 = new Employee(101, "Santhosh", 28000);
        Employee employee2 = new Employee(106, "Dasharath", 18000);
        Employee employee3 = new Employee(102, "Anjesh", 38000);
        Employee employee4 = new Employee(104, "Shekar", 64000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);


        /*Collections.sort(list,new IdComparator());
        Collections.sort(list,new NameComparator());*/
        Collections.sort(list, new SalaryComparator());

        for (Object employee : list) {
            Employee emp = (Employee) employee;
            System.out.println(emp.id + "," + emp.name + "," + emp.salary);
        }


    }
}
