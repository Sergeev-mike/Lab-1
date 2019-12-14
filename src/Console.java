import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Console {
    private Date date = new Date();
    public static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    void out(String msg) {
        System.out.print(msg);
    }

    void out(ArrayList<String> msg) {
        int i = 0;
        int size = msg.size();
        while (i < size) {
            System.out.println(msg.get(i));
            i++;
        }
    }

    String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    void log(int level, String msg) {
        switch (level) {
            case 1:
                this.out(ANSI_GREEN + "[" + date.toString() + "] " + ANSI_RESET + msg + "\n");
                return;
            case 2:
                this.out(ANSI_YELLOW + "Ошибка: " + ANSI_RESET + msg + "\n");
                return;
            case 3:
                this.out(ANSI_RED + "ВНИМАНИЕ: " + ANSI_RESET + msg + "\n");
                return;
        }
    }
}