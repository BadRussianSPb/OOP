
public class App {

    public static void main(String[] args) throws Exception {
        Person pers1 = new Person("Egor", "Pavlov", "27.01.1983", "m");
        Person pers2 = new Person("Denis", "Pavlov", "02.12.2014", "m");
        Person pers3 = new Person("Ksu", "Pavlova", "23.05.2019", "f");
        Person pers4 = new Person("Taras", "Pavlov", "09.01.2011", "m");
        Person pers5 = new Person("Natasha", "Pavlova", "31.05.1983", "f");
        System.out.println(pers1);
        System.out.println("---------------");

        Tree myTree = new Tree();
        myTree.append(pers1, Relations.parent, pers2);
        myTree.append(pers5, Relations.parent, pers2);
        myTree.append(pers2, Relations.sister, pers3);
        myTree.append(pers1, Relations.parent, pers4);

        Research test = new Research(myTree);
        test.viewTree();
        test.viewLinks(pers1);
        test.viewLinks(pers2);

    }
}
