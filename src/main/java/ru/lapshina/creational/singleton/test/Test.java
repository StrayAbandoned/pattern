package ru.lapshina.creational.singleton.test;

import ru.lapshina.creational.singleton.Singleton;

public class Test {
    private static void func(){
        Singleton.getINSTANCE().print();
    }

    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            new Thread(Test::func).start();
        }
    }
}
