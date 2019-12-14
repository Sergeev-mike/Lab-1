import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        ShifterColumn text = new ShifterColumn();
        console.out("Введите текст\n");
        ArrayList<String> strings = text.shift();
        console.out("Слова по убыванию в столбик:\n");
        console.out(strings);
        console.log(1,"qwead");
        console.log(2,"sad");
        console.log(3,"asda");
    }
}