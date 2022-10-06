import java.util.ArrayList;

public class Research {
    ArrayList<Person> tree;

    public Research(Tree someTree) {
        tree = someTree.getTree();
    }

    public void viewTree() {
        for (Person el : this.tree) {
            System.out.println(el);
        }
    }

    public void viewLinks(Person pers) {
        if (tree.indexOf(pers) == -1) {
            System.out.println("Объект не обнаружен");
        } else {
            System.out.println(String.format("Объект: %s %s", pers.FirstName, pers.SecondName));
            if (pers.childs.size() != 0) {
                System.out.println("Имеет детей: ");
                for (Person el : pers.childs) {
                    System.out.println(String.format("%s", el.FirstName));
                }
            }
            if (pers.parents.size() != 0) {
                System.out.println("Имеет родителей: ");
                for (Person el : pers.parents) {
                    System.out.println(String.format("%s", el.FirstName));
                }

            }
        }
    }
}
