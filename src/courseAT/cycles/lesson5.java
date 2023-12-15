package courseAT.cycles;

public class lesson5 {
    public static int numLen(long x){
        int count = 0;
        do {
            count++;
            x/=10;
        } while (x != 0);
        return count;

    }
}


/*Длина числа. Дана следующая сигнатура метода:

public static int numLen(long x);
Необходимо реализовать метод таким образом, чтобы он возвращал количество знаков в числе x.

Подсказка:
int у=123/10; // у будет иметь значение 12
Пример:
x=12567
результат: 5

 */