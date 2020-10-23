package com.eugene.javacore.practic3.prototype;

public class Square implements Copyable{
    private String colors;
    private int area;

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Square(String colors, int area) {
        this.colors = colors;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "colors='" + colors + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    public Object copy() {
        Copyable square = new Square(colors,area);
        return square;
    }
}
