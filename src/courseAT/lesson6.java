package courseAT;

public class lesson6 {
    public static boolean sum3(int x, int y, int z){
        if (x+z==y | x+y==z) return true;
        if (y+z==x | y+x==z) return true;
        return false;
    }
}





/*Тройная сумма. Дана следующая сигнатура метода:

public static boolean sum3(int x, int y, int z);
Необходимо реализовать метод таким образом, чтобы он возвращал true,
если два любых числа (из трех принятых) можно сложить так, чтобы получить третье.

Пример 1:
x=5  y=7  z=2
результат: true
Пример 2:
x=8  y=-1   z=4
результат: false*/