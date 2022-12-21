package ru.lapshina.behaviour.listener;

import ru.lapshina.behaviour.chain.Chain;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EventChain chain = new EventChain();
        chain.registerListener(System.out::println);
        chain.start();
        while (in.hasNext()){
            String s = in.nextLine();
            chain.publishEvent(new Event(s));
        }
    }
}
