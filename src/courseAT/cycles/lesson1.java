package courseAT.cycles;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

public class lesson1 {
    public static String listNums(int x) {
        for (int i = 0; i<x; i++ ) {
            System.out.print(i + " ");
        }
        return String.valueOf(x);
    }
}



/*Числа подряд. Дана следующая сигнатура метода:

public static String listNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку,
в которой будут записаны все числа от 0 до x (включительно).

Пример:
x=5
результат: “0 1 2 3 4 5”*/