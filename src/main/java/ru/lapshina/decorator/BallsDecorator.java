package ru.lapshina.decorator;

public class BallsDecorator extends TreeDecorator{
    public BallsDecorator(Tree tree) {
        super(tree);
    }

    @Override
    void decorate() {
        super.decorate();
        ballsDecorate();
    }
    private void ballsDecorate(){
        System.out.println("Balls decoration");
    }
}
