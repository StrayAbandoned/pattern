package ru.lapshina.structural.composit.expression;



public abstract class BinaryExpression implements Expression{
    private final Expression left, right;
    private final BinatyOperation operation;

    public BinaryExpression(Expression left, Expression right, BinatyOperation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int eval() {
        return operation.apply(left, right);
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
