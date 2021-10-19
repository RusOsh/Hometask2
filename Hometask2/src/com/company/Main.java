package com.company;

public class Main {


    public static Dog dog = new Dog("Simba", new String[]{"Sit", "Attack"});
    public static Cat cat = new Cat("Vasjka", 9);
    public static Snake snake = new Snake("Kobra", "Kobra's bite is hurts");
    public static Animal[] animals = {dog, cat, snake};



    public static void main(String[] args) {
        Printable[] print = {createObject("Cat"), createObject("Dog"), createObject("Snake")};

            for (Printable printable:print) {
                printable.print();
            }
        }




    public static Animal createObject(String className) {
        switch (className) {
            case "Dog" -> {
                System.out.println("Case Dog has been revoked:");
                return dog;
            }
            case "Cat" -> {
                System.out.println("Class Cat has been revoked:");
                return cat;
            }
            case "Snake" -> {
                System.out.println("Class Snake has been revoked:");
                return snake;
            }
            default -> {
                return dog;
            }
        }
    }
}
