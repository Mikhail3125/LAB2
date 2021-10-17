package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(5)+1;
        Squares squares = new Squares();
        squares.fillRandom(n);
        System.out.println(squares);
        squares.MinArea();

        n = r.nextInt(5)+1;
        Pyramids pyramids = new Pyramids();
        pyramids.fillRandom(n);
        System.out.println(pyramids);
        pyramids.NumofPyramids();
    }
}