package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pyramids {
    private final List<Pyramid> pyramids;

    public Pyramids(){
        pyramids = new ArrayList<>();
    }

    public List<Pyramid> getPyramids() {
        return pyramids;
    }

    public void add(Pyramid pyramid) {
        this.pyramids.add(pyramid);
    }

    public void remove(Pyramid pyramid) {
        this.pyramids.remove(pyramid);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            pyramids.add(Pyramid.generate());
        }
    }

    public void NumofPyramids(){
        int num = 0;
        System.out.println("Введите значение числа a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (Pyramid pyramid : this.pyramids){
            if (pyramid.getH() > a){
                num++;
            }
        }
        System.out.println("\n\nКоличество пирамид, апофема которых больше числа a: " + num);
    }

    @Override
    public String toString() {
        return "\n\n\nПирамиды" + pyramids + "; ";
    }
}
