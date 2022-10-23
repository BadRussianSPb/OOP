import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;

public class Record {
    public Record(String text, Author fio) {
        this.taskText = text;
        this.fio = fio;
        count++;
    }

    private static Integer count = 1;
    private Integer id = count;
    private Calendar recordDateTime = Calendar.getInstance();
    private String taskText;
    private Calendar deadLine = null;
    private Author fio;

    public Calendar getRecordDateTime() {
        return recordDateTime;
    }

    public void setDeadLine(Integer day) {
        this.deadLine = Calendar.getInstance();
        this.deadLine.add(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public String toString() {
        // Date dateTime = recordDateTime.getTime();
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat formaterTime = new SimpleDateFormat("HH:mm:ss");

        return String.format("%d. %s %s\n%s\nНе позже %s\n", id, formaterDate.format(
                recordDateTime.getTime()), formaterTime.format(recordDateTime.getTime()), taskText,
                formaterDate.format(deadLine.getTime()));
    }

}
