import java.io.FileWriter;
import java.io.IOException;

import Models.Model;

public class Filework {

    public static void LogToFile(Model m, String result) throws IOException {

        FileWriter fw = new FileWriter("CalcLog.txt", true);

        System.out.println("Запись в log...");
        fw.write(m + " = " + result + "\n");

        fw.close();
    }
}
