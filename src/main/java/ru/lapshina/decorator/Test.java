package ru.lapshina.decorator;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeDecorator decorator = new BallsDecorator(tree);
        decorator.decorate();
    }
}
