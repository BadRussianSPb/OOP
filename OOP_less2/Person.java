import java.util.HashSet;

public class Person {
    public Person(String fn, String sn, String db, String m) {
        this.firstName = fn;
        this.secondName = sn;
        this.dateOfBirth = db;
        this.gender = m;
        id = count++;
    }

    private static int count = 1;
    private int id;
    private String firstName;
    private String secondName;
    private String dateOfBirth;
    private String gender;
    private HashSet<Integer> childs = new HashSet<>();
    private HashSet<Integer> parents = new HashSet<>();

    Person up;
    Person down;
    Person flat;

    @Override
    public String toString() {
        return String.format("ID: %d\nИмя: %s\nФамилия: %s\nДата рождения: %s\nПол: %s\n", id, firstName, secondName,
                dateOfBirth, gender);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public HashSet<Integer> getChilds() {
        return childs;
    }

    public HashSet<Integer> getParents() {
        return parents;
    }

    // когда-нибудь добавить проверки в сеттеры

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setChilds(Integer id) {
        this.childs.add(id);
    }

    public void setParents(Integer id) {
        this.parents.add(id);
    }

}
