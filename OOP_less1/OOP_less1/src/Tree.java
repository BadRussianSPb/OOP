import java.util.ArrayList;

public class Tree {
    private ArrayList<Person> tree = new ArrayList<Person>();

    public void append(Person pe1, Relations re, Person pe2) {
        if (re == Relations.parent) {
            pe1.childs.add(pe2);
            pe2.parents.add(pe1);
        }
        if (re == Relations.child) {
            pe2.childs.add(pe1);
            pe1.parents.add(pe2);
        }
        if (re == Relations.sister | re == Relations.brother) {
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

    public Person get(int i) {
        return tree.get(i);
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

}
