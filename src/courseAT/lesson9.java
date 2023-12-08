package courseAT;

public class lesson9 {
    public static boolean magic6(int x, int y){
        int sum=x+y;
        int sub1=x-y;
        int sub2=y-x;
        if (x==6 | y==6) return true;
        if (sub1==6 | sub2==6) return true;
        if (sum==6) return true;
        return false;
    }
}



/*Волшебная шестерка. Дана следующая сигнатура метода:

public static boolean magic6(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал true,
 если одно из принятых методом чисел равно шести, или их сумма равна шести,
 или разница между ними равна шести.

Пример 1:
x=5  y=7
результат: false
Пример 2:
x=8  y=2
результат: true
Пример 3:
x=1  y=6
результат: true*/