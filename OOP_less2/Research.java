import java.util.ArrayList;
import java.util.HashSet;

public class Research {
    private ArrayList<Person> tree;

    Tree foo = new Tree(); //

    public Research(Tree someTree) {
        tree = someTree.getTree();
    }

    public void viewTree() {
        for (Person el : this.tree) {
            System.out.println(el);
        }
    }

    public void viewPersonLinks(Person pers) {
        if (tree.indexOf(pers) == -1) {
            System.out.println("ОБъект не обнаружен!");
        } else {
            System.out.println(
                    String.format("Объект: ID %d %s %s", pers.getId(), pers.getFirstName(), pers.getSecondName()));
            if (pers.getParents().size() != 0) {
                System.out.println("Имеет родителей:");
                for (Integer el : pers.getParents()) {
                    System.out.println(String.format("ID %d %s", el, foo.getName(tree, el)));
                }
            }
            if (pers.getChilds().size() != 0) {
                System.out.println("Имеет детей:");
            }
            for (Integer el : pers.getChilds()) {
                System.out.println(String.format("ID %d %s", el, foo.getName(tree, el)));
            }
        }
    }

    private boolean ifExist(Person pers) {
        if (tree.indexOf(pers) == -1) {
            System.out.println("ОБъект не обнаружен!");
            return false;
        } else {
            return true;
        }
    }

    public void viewGrandlinks(Person pers, Integer gen) {
        if (ifExist(pers)) {
            System.out.println(pers.getParents());
            for (Integer el : pers.getParents()) {
                if (gen != 1) {
                    viewGrandlinks(foo.getPerson(tree, el), --gen);
                } else {
                    System.out.println(foo.getPerson(tree, el));
                }
            }

        }
    }
}
