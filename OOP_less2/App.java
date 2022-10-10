
public class App {

    public static void main(String[] args) throws Exception {
        Person pers1 = new Person("Egor", "Pavlov", "27.01.1983", "m");
        Person pers2 = new Person("Denis", "Pavlov", "02.12.2014", "m");
        Person pers3 = new Person("Ksu", "Pavlova", "23.05.2019", "f");
        Person pers4 = new Person("Taras", "Pavlov", "09.01.2011", "m");
        Person pers5 = new Person("Natasha", "Pavlova", "31.05.1983", "f");
        Person pers6 = new Person("Luba", "Pavlova", "23.05.1950", "f");
        Person pers7 = new Person("Vladimir", "Pavlov", null, null);
        Person pers8 = new Person("Alex", "Golubev", null, "m");

        System.out.println(pers1);
        System.out.println("---------------");

        Tree myTree = new Tree();
        myTree.append(pers1, Relations.PARENT, pers2);
        myTree.append(pers5, Relations.PARENT, pers2);
        myTree.append(pers2, Relations.SISTER, pers3);
        myTree.append(pers1, Relations.PARENT, pers4);
        myTree.append(pers6, Relations.PARENT, pers1);
        myTree.append(pers7, Relations.PARENT, pers1);
        myTree.append(pers8, Relations.PARENT, pers5);
        myTree.append(pers5, Relations.PARENT, pers4);

        Research test = new Research(myTree);
        test.viewTree();
        System.out.println("---------------");

        test.viewPersonLinks(pers1);
        System.out.println();
        test.viewPersonLinks(pers5);
        System.out.println("---------------");

        test.viewGrandlinks(pers4, 2);

    }
}
