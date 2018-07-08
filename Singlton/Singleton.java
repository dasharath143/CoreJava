package com.dasharath.java;

public class Singleton {

    private static Singleton singleton ;

    private Singleton() {

    }

    protected static Singleton getInstance()

    {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;

    }

}


