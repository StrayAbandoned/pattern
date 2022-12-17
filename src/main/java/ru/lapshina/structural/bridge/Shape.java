package ru.lapshina.structural.bridge;

public abstract class Shape {
    private final Paint paint;

    protected Shape(Paint paint) {
        this.paint = paint;
    }

    public void fillShape() {
        paint.fill(this);
    }

    public void strokeShape(){
        paint.stroke(this);
    }

}
