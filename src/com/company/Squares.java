package com.company;

import java.util.ArrayList;
import java.util.List;

public class Squares {
    private final List<Square> squares;

    public Squares()
    {
        squares = new ArrayList<>();
    }

    public List<Square> getSquares() {
        return squares;
    }

    public void add(Square square) {
        this.squares.add(square);
    }

    public void remove(Square square) {
        this.squares.remove(square);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            squares.add(Square.generate());
        }
    }

    public void MinArea(){
        int min = this.squares.get(0).getArea();
        for (Square square : this.squares){
            if (square.getArea() < min){
                min = square.getArea();
            }
        }
        System.out.println("\n\nКвадрат с минимальной площадью:\n");
        for (Square square : this.squares){
            if (min == square.getArea()){
                System.out.println(square);
            }
        }
    }

    @Override
    public String toString() {
        return "\n\n\nКвадраты" + squares + "; ";
    }
}
