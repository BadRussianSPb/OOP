import java.util.ArrayList;

public class Tree {
    private ArrayList<Person> tree = new ArrayList<Person>();

    public void append(Person pe1, Relations re, Person pe2) {
        if (re == Relations.PARENT) {
            pe1.setChilds(pe2.getId());
            pe2.setParents(pe1.getId());
        }
        if (re == Relations.CHILD) {

            pe2.setChilds(pe1.getId());
            pe1.setParents((pe2.getId()));
        }

        if (re == Relations.SISTER | re == Relations.BROTHER) {
        }
        if (tree.indexOf(pe1) != -1) {
            tree.set(tree.indexOf(pe1), pe1);
        } else {
            tree.add(pe1);
        }
        if (tree.indexOf(pe2) != -1) {
            tree.set(tree.indexOf(pe2), pe2);
        } else {
            tree.add(pe2);
        }
    }

    public String getName(ArrayList<Person> tree, int id) {
        for (Person el : tree) {
            if (el.getId() == id) {

                return String.format("%s", el.getFirstName() + " " + el.getSecondName());
            }
        }
        return "-1";
    }

    public ArrayList<Person> getTree() {
        return tree;
    }

    public Integer getLength() {
        return tree.size();
    }

    public Person find(Person pers) {
        return tree.get(tree.indexOf(pers));
    }

    public Person getPerson(ArrayList<Person> tree, Integer id) {
        for (Person el : tree) {
            if (el.getId() == id) {
                return el;
            }
        }
        return null;
    }
}
