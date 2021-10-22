package com.company;

import java.util.Random;

public class Square {
    private int a;

    public Square(int a) {
        setA(a);
    }

    public static Square generate() {
        Random r = new Random();
        return new Square(r.nextInt(10) + 1);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = (a > 0 ? a : new Random().nextInt(10) + 1);
    }

    public int getArea() {
        return a*a;
    }

    @Override
    public String toString() {
        return "\n\nКвадрат{\n" +
                "a: " + a +
                "\nДиагональ: " + (int) Math.sqrt(2 * a * a) +
                "\nПериметр: " + 4 * a +
                "\nПлощадь: " + getArea() +
                "\n}";
    }
}
