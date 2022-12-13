package ru.lapshina.creational.builder.test;

import ru.lapshina.creational.builder.User;

public class Test {
    public static void main(String[] args) {
        User user = User.newBuilder().withName("Ivan")
                .withUsername("Ivanov")
                .withAddress("Moscow")
                .withAge(30)
                .withEmail("123@qwe.ru")
                .withHeight(165)
                .withWeight(55)
                .build();
        System.out.println(user);
    }
}
