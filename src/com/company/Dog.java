package com.company;

import java.util.Arrays;

public class Dog extends Animal{

    private String[] commands;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String[] commands) {
        super(name);
        this.commands = commands;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\ncommands: " + Arrays.toString(commands));
    }
}