package ru.lapshina.creational.singleton;

public class Singleton {
    private static Singleton INSTANCE;
    private Singleton(){
        System.out.println(this);
    }

    public synchronized static Singleton getINSTANCE() {
        if (INSTANCE==null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    public void print(){
        System.out.println("Singleton "+this);
    }
}
