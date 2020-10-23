package com.eugene.javacore.practic3.prototype;

public class Runner {
    public static void main(String[] args) {
        Copyable square = new Square("black",20);
        System.out.println(square.toString());
        SquareFactory squareFactory = new SquareFactory(square);
        Copyable square1 = squareFactory.copySqr();
       System.out.println( square1.toString());
    }
}
