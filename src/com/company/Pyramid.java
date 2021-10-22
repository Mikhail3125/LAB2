package com.company;

import java.util.Random;

public class Pyramid extends Square {
    private int h;

    public Pyramid(int a, int h) {
        super(a);
        setH(h);
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = (h > 0 ? h : new Random().nextInt(10) + 1);;
    }

    public static Pyramid generate(){
        Random r = new Random();
        return new Pyramid(r.nextInt(10)+1, r.nextInt(10)+1);
    }

    public int Area(){
        int area = (int)((0.5*getA()*h)*4 + super.getA()*super.getA());
        return area;
    }

    public int Height(){
        int height = (int)Math.sqrt(h*h - (getA()/2)*(getA()/2));
        return height;
    }

    public int Volume(){
        int volume = (Height()*getA()*getA())/3;
        return volume;
    }

    @Override
    public String toString() {
        return "\n\nПирамида{\n" +
                "a: " + super.getA() +
                "\nh: " + h +
                "\nОбъем: " + Volume() +
                "\nПлощадь: " + Area() +
                "\n}";
    }
}
