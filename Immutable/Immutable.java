package com.dasharath.immutable;

public class Immutable {
    private final int id;
    private final String name;
    private final Age age;



    public Immutable(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public Age getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Age age=new Age();
        age.setDay(10);
        age.setMonth(8);
        age.setYear(1989);

        Immutable immu=new Immutable(101,"Dasharath",age);
        System.out.println(immu);
        age.setDay(10);
        age.setMonth(8);
        age.setYear(19833);
        System.out.println(immu);



    }
}

