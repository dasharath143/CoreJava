package com.dasharath.collections;

import java.util.Comparator;
import java.util.TreeSet;

class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class IdComparator implements Comparator {

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


class NameComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
       return e1.getName().compareTo(e2.getName());
    }
}

public class TreesetComparator {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new NameComparator());
        TreeSet treeSet2 = new TreeSet(new IdComparator());
        Employee employee1 = new Employee(101, "Shekar", 60000);
        Employee employee2 = new Employee(106, "Dasharath", 60000);
        Employee employee3 = new Employee(102, "Anjesh", 60000);
        Employee employee4 = new Employee(109, "Mahesh", 60000);
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);

        treeSet2.add(employee1);
        treeSet2.add(employee2);
        treeSet2.add(employee3);
        treeSet2.add(employee4);
        
        //System.out.println("Sorting Employee with based on Name");
        for(Object employee:treeSet)
        {
            Employee emp=(Employee)employee;
            System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
        }
       
        //System.out.println("Sorting Employee with based on Id");
        for(Object employee:treeSet2)
        {
            Employee emp=(Employee)employee;
            System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
        }

    }
}
