import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TaskManager<Pri, ArreyList> extends HashMap<Priorities, List> {

    public TaskManager() {
        ArrayList<Record> spam = new ArrayList<Record>();
        ArrayList<Record> spam2 = new ArrayList<Record>();
        ArrayList<Record> spam3 = new ArrayList<Record>();
        this.put(Priorities.RIGHTNOW, spam);
        this.put(Priorities.NOTNOW, spam2);
        this.put(Priorities.LONGAWAY, spam3);

    }

    public void add(Priorities prio, Record rec) {
        this.get(prio).add(rec); // а куда сдесь поставить <>?
        if (prio == Priorities.RIGHTNOW) {
            rec.setDeadLine(1);
        }
        if (prio == Priorities.NOTNOW) {
            rec.setDeadLine(5);
        }
        if (prio == Priorities.LONGAWAY) {
            rec.setDeadLine(30);
        }
    }

    public List<Record> getPrioRecords(Priorities prio) {
        return this.get(prio);
    }

    public TaskManager getAllRecords(TaskManager book) {
        return book;
    }
}
