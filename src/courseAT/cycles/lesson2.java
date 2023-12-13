package courseAT.cycles;

import static java.util.stream.IntStream.*;

public class lesson2 {
    public static String reverseListNums(int x) {
        String a = "0";
        for (int i=x; i>0; i--){
            System.out.print(i + " ");
        }
    return a;
    }
}


/*Числа наоборот. Дана следующая сигнатура метода:

public static String reverseListNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку,
в которой будут записаны все числа от x до 0 (включительно).

Пример:
x=5
результат: “5 4 3 2 1 0”*/