package com.company;

public class Snake extends Animal {

    private String bite;

    public Snake(String name) {
        super(name);
    }

    public Snake(String name, String bite) {
        super(name);
        this.bite = bite;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nbite: " + bite);
    }
}