package com.company;

import lombok.Getter;
import lombok.Setter;

public class Square {
    final double SIDES = 4;
    @Getter @Setter double side ;

    public Square() {
        side=0;
    }

    public Square(double side) {
        this.side = side > 0 ? side : 0;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * SIDES;
    }

    public double getDiagonal() {
        return this.side *  Math.sqrt(2);
    }

    @Override
    public  String toString(){
        String str;
        if (side!=0){
            str = "Квадрат:" +
                    "\n\tсторона= " + side +
                    "\n\tплощадь= " + getArea() +
                    "\n\tпериметр= " + getPerimeter() +
                    "\n\tдиагональ= " + String.format("%6.2f",getDiagonal());
        }else
            str = "Квадрат:" +
                    "\n\tсторона= " + side  ;
        return  str;
    }
}