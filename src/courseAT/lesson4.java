package courseAT;

public class lesson4 {
       public static String makeDecision(int x, int y){
           int a = Integer.valueOf(x);
           int b = Integer.valueOf(y);
           int b1 = b;
           int a1 = a;
           String s = a1+">"+b1;
           String t = a1+"<"+b1;
           String eq = a1+"="+b1;
           if (a>b) return s;
           if (a<b) return t;
           return eq;
       }
       }




/*Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая включает два принятых
методом числа и корректно выставленный знак операции сравнения (больше, меньше, или равно).

Пример 1:
x=5  y=7
результат: “5 < 7”
Пример 2:
x=8  y=-1
результат: “8 > -1”
Пример 3:
x=4  y=4
результат: “4 == 4”*/