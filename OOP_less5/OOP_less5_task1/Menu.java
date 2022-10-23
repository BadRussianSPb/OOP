import java.util.Scanner;

import Models.ComplexModels.DiffModelComplex;
import Models.ComplexModels.DivModelComplex;
import Models.ComplexModels.MultModelComplex;
import Models.ComplexModels.SumModelComplex;
import Models.RationalMadels.DiffModel;
import Models.RationalMadels.DivModel;
import Models.RationalMadels.MultModel;
import Models.RationalMadels.SumModel;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public Menu() {
    }

    public void start() {
        System.out.println("\033[H\033[J");
        System.out.println("Основное меню.");
        System.out.println("1 - Операции с дробями.");
        System.out.println("2 - Операции с комплексными числами.");
        System.out.println("Y - EXIT");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                String key = sc.next();
                switch (key) {
                    case "1":
                        fractions();
                        break;
                    case "2":
                        complex();
                        break;
                    case "Y":
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }

    public void fractions() {
        System.out.println("\033[H\033[J");
        System.out.println("Меню дробей.");
        System.out.println("1 - сложение.");
        System.out.println("2 - вычитание.");
        System.out.println("3 - умножение.");
        System.out.println("4 - деление.");
        System.out.println("N - Back");
        System.out.println("Y - EXIT");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                String key = sc.next();
                switch (key) {
                    case "1":
                        new Presenter(new SumModel(), new View()).mainClick();
                        continuation();
                        break;
                    case "2":
                        new Presenter(new DiffModel(), new View()).mainClick();
                        continuation();
                        break;
                    case "3":
                        new Presenter(new MultModel(), new View()).mainClick();
                        continuation();
                        break;
                    case "4":
                        new Presenter(new DivModel(), new View()).mainClick();
                        continuation();
                        break;
                    case "N":
                        start();
                        break;
                    case "Y":
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }

    public void complex() {
        System.out.println("\033[H\033[J");
        System.out.println("Меню комплексных чисел.");
        System.out.println("1 - сложение.");
        System.out.println("2 - вычитание.");
        System.out.println("3 - умножение.");
        System.out.println("4 - деление.");
        System.out.println("N - Back");
        System.out.println("Y - EXIT");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                String key = sc.next();
                switch (key) {
                    case "1":
                        new Presenter(new SumModelComplex(), new View()).mainClick();
                        continuation();
                        break;
                    case "2":
                        new Presenter(new DiffModelComplex(), new View()).mainClick();
                        continuation();
                        break;
                    case "3":
                        new Presenter(new MultModelComplex(), new View()).mainClick();
                        continuation();
                        break;
                    case "4":
                        new Presenter(new DivModelComplex(), new View()).mainClick();
                        continuation();
                        break;
                    case "N":
                        start();
                        break;
                    case "Y":
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }

    public void continuation() {
        System.out.println();
        System.out.println("1 - продолжить.");
        System.out.println("2 - ВЫХОД.");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                String key = sc.next();
                switch (key) {
                    case "1":
                        start();
                        break;
                    case "2":
                        System.exit(1);
                        break;
                }
            }
        }
    }
}
