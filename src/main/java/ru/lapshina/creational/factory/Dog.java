package ru.lapshina.creational.factory;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    @Override
    public void say() {
        System.out.println("Wow");

    }
}
