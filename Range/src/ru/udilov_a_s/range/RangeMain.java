package ru.udilov_a_s.range;

import java.util.Scanner;

public class RangeMain {

    public static double printAndRead(String message) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        double from = printAndRead("Введите начало диапазона: ");
        double to = printAndRead("Введите конец диапазона: ");

        Range range = new Range(from, to);
        System.out.println(range.toString());

        System.out.println("Длинна диапазона: " + range.getLength());

        double number = printAndRead("Введите число для проверки его принадлежности данному диапазону: ");

        if (range.isInside(number)) {

            System.out.println("Число лежит в диапазоне!");

        } else {

            System.out.println("Число не лежит в диапазоне!");
        }
    }
}
