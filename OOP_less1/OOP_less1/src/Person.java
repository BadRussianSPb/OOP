import java.util.HashSet;

public class Person {
    public Person(String fn, String sn, String db, String m) {
        this.FirstName = fn;
        this.SecondName = sn;
        this.DateOfBirth = db;
        this.Gender = m;
        id = count++;
    }

    private static int count = 1;
    private int id;
    String FirstName;
    String SecondName;
    String DateOfBirth;
    String Gender;
    HashSet<Person> childs = new HashSet<>();
    HashSet<Person> parents = new HashSet<>();

    Person up;
    Person down;
    Person flat;

    @Override
    public String toString() {
        return String.format("ID: %d\nИмя: %s\nФамилия: %s\nДата рождения: %s\nПол: %s\n", id, FirstName, SecondName,
                DateOfBirth, Gender);
    }
}
