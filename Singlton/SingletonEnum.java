package com.dasharath.dpatterns;

enum EnumDemo {
    INSTANCE,NEWINSTANCE;
    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}

public class  SingletonEnum  {
    public static void main(String[] args) {
        EnumDemo singleton = EnumDemo.INSTANCE;
        EnumDemo singleton1 = EnumDemo.NEWINSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
        singleton1.setValue(2);
        System.out.println(singleton1.getValue());
    }
}
