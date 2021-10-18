package com.company;

public class Cat extends Animal{

    private int lives;


    public Cat(String name, int lives) {
        super(name);
        this.lives = lives;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\n# of lives: " + lives);
    }
}