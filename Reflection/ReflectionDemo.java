package com.dasharath.reflection;

import java.lang.reflect.Constructor;

public class ReflectionDemo {
    private int id;
    private String name;

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

    private ReflectionDemo() {

    }

    @Override
    public String toString() {
        return "ReflectionDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        //Creating an object of the class using reflection api 1st way
        ReflectionDemo reflectionDemo = (ReflectionDemo.class).newInstance();
        System.out.println(reflectionDemo);

        //Creating an object of the class using reflection api 2nd way
        try {
            Constructor[] constructors =
                    ReflectionDemo.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {

                constructor.setAccessible(true);
                ReflectionDemo instance2 = (ReflectionDemo) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
