package com.eugene.javacore.practic3.prototype;

public class SquareFactory {
    Copyable square;


    public SquareFactory(Copyable square) {
        this.square = square;
    }
    public Copyable copySqr(){
        return (Square)square.copy();
    }
}
