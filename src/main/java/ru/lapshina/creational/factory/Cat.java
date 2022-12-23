package ru.lapshina.creational.factory;

public class Cat  extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public void say() {
        System.out.println("Meow");

    }
}
