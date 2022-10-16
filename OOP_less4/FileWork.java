import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;

public abstract class FileWork {
    public static void saveToFile(TaskManager<Priorities, ArrayList<Record>> book) throws IOException {
        FileWriter f = new FileWriter("book.txt");

        for (Priorities prio : book.keySet()) {
            f.write(String.format("%s\n", prio));
            for (Object el : book.get(prio)) {
                f.write(String.format("%s", el));
            }
        }
        f.close();
    }
    /*
     * public static void readFromFile(String name) throws IOException {
     * 
     * FileReader f = new FileReader(name);
     * int c;
     * while ((c = f.read()) != -1) {
     * System.out.println((char) c);
     * }
     * }
     */

}
