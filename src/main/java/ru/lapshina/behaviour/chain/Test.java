package ru.lapshina.behaviour.chain;

public class Test {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.add(
                object -> {
                    System.out.println(object);
                    return "123";
                },
                object -> {
                    String s = (String) object;
                    System.out.println(s);
                    return s.length();
                },
                object -> {
                    int length = (int) object;
                    length++;
                    System.out.println(length);
                    return length;
                }
        );
        chain.process("Hello");
    }
}
