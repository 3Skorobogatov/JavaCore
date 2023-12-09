package courseAT.conditions_IF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lesson12 {
    public static void printDays(String x){
        Scanner scanner = new Scanner(System.in);
        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        String incorrect = "это не день недели";
        switch (x){
            case "понедельник" : System.out.println(days[0]+", "+ days[1] +", " + days[2] + ", " + days[3] + ", " + days[4] + ", "+days[5] + ", " + days[6]); break;
            case "вторник" : System.out.println(days[1]+", "+days[2]+", "+days[3]+", "+days[4]+", "+days[5]+", "+days[6]); break;
            case "среда" : System.out.println(days[2]+", "+days[3]+", "+days[4]+", "+days[5]+", "+days[6]); break;
            case "четверг" : System.out.println(days[3]+", "+days[4]+", "+days[5]+", "+days[6]);break;
            case "пятница" : System.out.println(days[4]+", "+days[5]+", "+days[6]);break;
            case "суббота" : System.out.println(days[5]+", "+days[6]); break;
            case "воскресенье" : System.out.println(days[6]); break;
        }

    }

}


/*Вывод дней недели. Дана следующая сигнатура метода:

public static void printDays(String x);
В качестве параметра метод принимает строку, в которой записано название дня недели.
Необходимо реализовать метод таким образом, чтобы он выводил на экран название переданного
в него дня и всех последующих до конца недели дней. Если в качестве строки передан не день,
то выводится текст “это не день недели”. Первый день понедельник, последний – воскресенье.
Вместо if в данной задаче используйте switch.

Обратите внимание, что делать для каждого из case вывод сразу всех дней
(например case “понедельник” sout(“понедельник вторник среда четверг пятница суббота воскресенье”) – решение явно некорректное.
Попробуйте применить для решения задачи принцип падения сквозь метки.

Пример:
x=”четверг”
результат:
четверг
пятница
суббота
воскресенье
Пример:
x=”чг”
результат:
это не день недели*/