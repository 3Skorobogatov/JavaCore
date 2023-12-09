package courseAT.conditions_IF;

public class lesson11 {
    public static String day(int x) {
        int a = Integer.valueOf(x);
        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        String incorrect = "это не день недели";
        switch (a){
            case 1 : return days[0];
            case 2 : return days[1];
            case 3 : return days[2];
            case 4 : return days[3];
            case 5 : return days[4];
            case 6 : return days[5];
            case 7 : return days[6];
        }
        return incorrect;
    }

}


/*День недели. Дана следующая сигнатура метода:

public static String day(int x);
Метод принимает число x, обозначающее день недели. Необходимо
реализовать метод таким образом, чтобы он возвращал строку, которая
будет обозначать текущий день недели, где 1- это понедельник, а 7 – воскресенье.
Если число не от 1 до 7 то верните текст “это не день недели”. Вместо if в данной задаче используйте switch.

Пример:
x=5
результат: “пятница”*/