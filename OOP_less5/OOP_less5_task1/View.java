import java.util.Scanner;

public class View {

    Scanner sc = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return sc.nextInt();
    }

    public void print(String data, String title) {
        System.out.printf("%s %s\n", data, title);
    }
}
