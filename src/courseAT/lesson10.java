package courseAT;

public class lesson10 {
    public static String age(int x){

        int a = Integer.valueOf(x);
        int a1 = a;
        String god = a1+" год";
        String goda = a1+" года";
        String let = a1+" лет";
        int b = a%10;
        int c = a%100;
        if (b == 1 && c != 11) return god;
        if (b == 2 | b == 3 | b == 4 && c != 12 && c != 13 && c != 14 ) return goda;
        return let;
    }
}


/*Возраст. Дана следующая сигнатура метода:

public static String age(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку,
в которой сначала будет число х, а затем одно из слов:

год
года
лет
Слово “год” добавляется, если число х заканчивается на 1, кроме чисел оканчивающихся на 11.

Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел оканчивающихся на 12, 13, 14.

Слово “лет” добавляется во всех остальных случаях.

Подсказка: оператор % позволяет получить остаток от деления.

Пример 1:
x=5
результат: “5 лет”
Пример 2:
x=31
результат: “31 год”
Пример 3:
x=44
результат: “44 года”*/