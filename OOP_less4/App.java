
import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {

        Author fio1 = new Author("Павлов Егор Владимирович");

        Record rec1 = new Record("Сделать 4 задание.", fio1);
        Record rec2 = new Record("Достроить дом.", fio1);
        Record rec3 = new Record("Собраться на работу.", fio1);
        Record rec4 = new Record("Не профукать выходные.", fio1);

        TaskManager<Priorities, ArrayList<Record>> myTasks = new TaskManager<>();

        myTasks.add(Priorities.RIGHTNOW, rec1);
        myTasks.add(Priorities.LONGAWAY, rec2);
        myTasks.add(Priorities.NOTNOW, rec3);
        myTasks.add(Priorities.NOTNOW, rec4);

        try {
            FileWork.saveToFile(myTasks);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
            e.printStackTrace();
        }

        // FileWork.readFromFile("testBook.txt");

    }
}
