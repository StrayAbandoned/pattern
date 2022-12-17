package ru.lapshina.structural.bridge;

public class GreenPaint implements Paint {


    @Override
    public void fill(Shape shape) {
        shape.fillShape();
    }

    @Override
    public void stroke(Shape shape) {
        shape.strokeShape();
    }

    @Override
    public void point(int x, int y) {


    }
}
