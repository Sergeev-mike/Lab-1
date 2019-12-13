import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ShifterColumn {
    void shift() {
        Console console = new Console("Input string: ");
        String line = console.readLine();
        ArrayList<String> row = new ArrayList<>(Arrays.asList(line.split("[\\W0-9]+")));
        Collections.sort(row);
        Collections.reverse(row);
        console.Console(row);
    }

}