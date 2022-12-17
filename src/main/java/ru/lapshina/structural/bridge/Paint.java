package ru.lapshina.structural.bridge;

public interface Paint {
    void fill(Shape shape);
    void stroke(Shape shape);
    void point(int x, int y);
}
