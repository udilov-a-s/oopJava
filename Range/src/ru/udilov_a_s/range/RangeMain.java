package ru.udilov_a_s.range;

import java.util.Arrays;
import java.util.Scanner;

public class RangeMain {

    public static double printAndRead(String message) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        System.out.println("Принадлежность числа интервалу. Код команды:  1");
        System.out.println("Пересечение интервалов.         Код команды:  2");
        System.out.println("Объединение интервалов.         Код команды:  3");
        System.out.println("Вычитание интервалов.           Код команды:  4");
        System.out.println("_______________________________________________");

        System.out.print("Введите код команды: ");
        Scanner scanner = new Scanner(System.in);
        int commandCod = scanner.nextInt();

        if (commandCod == 1 || commandCod == 2 || commandCod == 3 || commandCod == 4) {

            if (commandCod == 1) {

                double from = printAndRead("Введите начало диапазона: ");
                double to = printAndRead("Введите конец диапазона: ");

                Range range = new Range(from, to);

                System.out.println(range.toString());
                System.out.println("Длинна диапазона: " + range.getLength());
                System.out.println("Начало диапазона через геттер: " + range.getFrom());
                System.out.println("Конец диапазона через геттер: " + range.getTo());

                double newFrom = printAndRead("Введите новое начало диапазона: ");
                double newTo = printAndRead("Введите новое начало диапазона: ");

                range.setFrom(newFrom);
                range.setTo(newTo);

                System.out.println("Новое начало диапазона через геттер: " + range.getFrom());
                System.out.println("Новый конец диапазона через геттер: " + range.getTo());

                double number = printAndRead("Введите число для проверки его принадлежности данному диапазону: ");

                if (range.isInside(number)) {

                    System.out.println("Число лежит в диапазоне!");

                } else {

                    System.out.println("Число не лежит в диапазоне!");
                }

            } else {

                double from1 = printAndRead("Введите начало первого диапазона: ");
                double to1 = printAndRead("Введите конец первого диапазона: ");
                Range range1 = new Range(from1, to1);

                double from2 = printAndRead("Введите начало второго диапазона: ");
                double to2 = printAndRead("Введите конец второго диапазона: ");
                Range range2 = new Range(from2, to2);

                System.out.println("Первый интервал " + range1.toString());
                System.out.println("Второй интервал " + range2.toString());

                if (commandCod == 2) {

                    System.out.print("Результат операции пересечения: ");

                    if (range1.getIntersection(range2) == null) {

                        System.out.println("пересечений интервалов нет!");
                    } else {

                        System.out.println(range1.getIntersection(range2).toString());
                    }
                }

                if (commandCod == 3) {

                    System.out.print("Результат операции объединения: " + Arrays.toString(range1.getUnion(range2)));
                }

                if (commandCod == 4) {

                    System.out.print("Результат операции вычитания: " + Arrays.toString(range1.getDifference(range2)));
                }
            }

        } else {

            System.out.print("Результат операции: ");
            System.out.print("вы ввели неизвестную команду!");
        }
    }
}
