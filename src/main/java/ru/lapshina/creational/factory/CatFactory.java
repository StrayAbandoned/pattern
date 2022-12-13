package ru.lapshina.creational.factory;

public class CatFactory extends MyFactory{
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
