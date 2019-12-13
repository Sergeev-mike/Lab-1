import java.util.ArrayList;
import java.util.Scanner;

class Console {
    Console(String msg) {
        System.out.print(msg);
    }

    void Console(ArrayList<String> msg) {
        int i = 0;
        while (i < msg.size()) {
            System.out.println(msg.get(i));
            i++;
        }
    }

    String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}