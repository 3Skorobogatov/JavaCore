package courseAT.conditions_IF;

public class lesson4 {
       public static String makeDecision(int x, int y){
           int a = Integer.valueOf(x);
           int b = Integer.valueOf(y);
           String more = a+">"+b;
           String less = a+"<"+b;
           String eq = a+"="+b;
           if (a>b) return more;
           if (a<b) return less;
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