package ru.lapshina.creational.factory.test;

import ru.lapshina.creational.factory.CatFactory;
import ru.lapshina.creational.factory.DogFactory;
import ru.lapshina.creational.factory.MyFactory;

public class Test {
    private static void createAnimalAndSay(MyFactory myFactory){
        myFactory.getAnimal().say();
    }
    public static void main(String[] args) {
        createAnimalAndSay(new CatFactory());
        createAnimalAndSay(new DogFactory());
    }
}
