package com.company;


import java.util.Scanner;
import com.company.Square;
import com.company.PerfPyramid;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantitySquares = 0;
        double averageArea = 0;
        boolean isNotCorrect = true;

        while (isNotCorrect) {
            System.out.println("Кол-во квадратов: ");
            String str1 = scanner.next();
            isNotCorrect = isCorrect(str1, 1);
            System.out.println("Кол-во квадратов: ");
            if(!isNotCorrect)
                quantitySquares = Integer.parseInt(str1);
            else
                System.out.println("Введите число больше 0: ");
        }
    double[] sideSquare = new double[quantitySquares];
    for (int i=0; i < quantitySquares; i++){
        System.out.println("Введите сторону кв " + (i+1) + ": ");
        String str2 = scanner.next();
        isNotCorrect = isCorrect(str2, 1);
        System.out.println("Кол-во квадратов: ");
        if(!isNotCorrect)
            quantitySquares = Integer.parseInt(str2);
        else
            System.out.println("Введите число больше 0: ");
            i--;
            continue;
        }
        Square square = Square(sideSquare[i]);

        System.out.println(square);
    }
}