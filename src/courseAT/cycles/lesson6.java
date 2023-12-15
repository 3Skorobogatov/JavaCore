
package courseAT.cycles;
public class lesson6 {
    public static boolean equalNum(int x){
        for (; x>0; x/=10){
            if ( x/10 == x/10%10) x+= ;
        }
        return false;
    }
}






/*Одинаковость. Дана следующая сигнатура метода:

public static boolean equalNum(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае.

Подсказки:

int x=123%10; // х будет иметь значение 3

int у=123/10; // у будет иметь значение 12

Пример 1:
x=1111
результат: true
Пример 2:
x=1211
результат: false

 */