package courseAT.cycles;

public class lesson3 {
    public static String chet(int x){
        for (int i=0; i<x; i+=2){
            System.out.println(i);
        }
        return String.valueOf(x);
    }
}



/*
Четные числа. Дана следующая сигнатура метода:

public static String chet(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку,
в которой будут записаны все четные числа от 0 до x (включительно).
Подсказа для обеспечения качества кода: инструкцию if использовать не следует.

Пример:
x=9
результат: “0 2 4 6 8”
 */