package ru.lapshina.structural.composit;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        Item root = new Dir(List.of(new Image("1"),
                new Image("2"),
                new Dir(List.of(new Image("3"),
                        new Image("4")))));
        System.out.println(root);
    }

}
