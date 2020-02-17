package Main.Java;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String menu = "Make your choice:\n1: NumberColumn\n2: DrawRectangle\n3: DrawSquare\n4: Max\n5: RecurNumberColumn\n6: RecurRectangle\n\nQ: Exit";


    public static void main(String[] args) {
        do {
            System.out.println(menu);
            choice();
        } while (sc.hasNext());
    }

    static void newLine() {
        System.out.println("Input x:");
        int x = isPositiveInt();
        for (int i = 0; i < x; i++) {
            System.out.println(i + 1);
        }
        goOn();
    }

    static void drawRectangle() {
        System.out.println("Input a, b:");
        int a = isPositiveInt();
        int b = isPositiveInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        goOn();
    }

    static void drawSquare() {
        System.out.println("Input a:");
        int a = isPositiveInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        goOn();
    }

    static double numMax(double a, double b) {
        return a == b ? a : Math.max(a, b);
    }

/*    static int numMax(int a, int b) {
        return a == b ? a : a > b ? a : b;
    }

    static double numMax(int a, double b) {
        return a == b ? a : a > b ? a : b;
    }

    static double numMax(double a, int b) {
        return a == b ? a : a > b ? a : b;
    }*/

    static void shownumMax() {
        System.out.println("Input a, b:");
        double a = isDouble();
        double b = isDouble();

        System.out.println(numMax(a, b));
        goOn();
    }

    static String newRecurLine(int x) {
        return x == 1 ? "1" : newRecurLine(x - 1) + "\n" + x;
    }

    static void shownewRecurLine() {
        System.out.println("Input a:");
        int a = isInt();

        System.out.println(newRecurLine(a));
        goOn();
    }

    static String newString(int a) {
        return a == 1 ? "+" : newString(a - 1) + "+";
    }

    static String recurRectangle(int a, int b) {
        return b == 1 ? newString(a) : newString(a) + "\n" + recurRectangle(a, b - 1);
    }

    static void showRecurRectangle() {
        System.out.println("Input a, b:");
        int a = isPositiveInt();
        int b = isPositiveInt();

        System.out.println(recurRectangle(a, b));
        goOn();
    }

/*    static Object isDoubleInt() {
        Object[] id = new Object[1];
        boolean b = false;

        while (!b) {
            if (!sc.hasNextDouble() && !sc.hasNextInt()) {
                sc.next();
                System.out.println("Re-input: ");
            } else if (sc.hasNextInt()) {
                id[0] = sc.nextInt();
                b = true;
            } else if (sc.hasNextDouble()) {
                id[0] = sc.nextDouble();
                b = true;
            }
        }
        return id[0];
    }*/

    static double isDouble() {
        double i = 0;
        boolean b = false;

        while (!b) {
            if (!sc.hasNextDouble()) {
                sc.next();
                System.out.println("Re-input: ");
            } else {
                i = sc.nextDouble();
                b = true;
            }
        }
        return i;
    }

    static int isInt() {
        int i = 0;
        boolean b = false;

        while (!b) {
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Re-input: ");
            } else {
                i = sc.nextInt();
                b = true;
            }
        }
        return i;
    }

    static int isPositiveInt() {
        int i = 0;
        boolean b = false;

        while (!b) {
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Re-input: ");
            } else {
                i = sc.nextInt();
                if (i < 1) {
                    System.out.println("Re-input: ");
                } else {
                    b = true;
                }
            }
        }
        return i;
    }

    static void goOn() {
        System.out.println("\nContinue?\nY: Yes\nAnyOtherKey: Exit");
        String i = sc.next();
        switch (i) {
            case "Y":
            case "y": {
                System.out.println(menu);
                choice();
            }
            default:
                System.exit(0);
        }
    }

    static void choice() {
        do {
            String i = sc.next();
            switch (i) {
                case "1":
                    newLine();
                    break;
                case "2":
                    drawRectangle();
                    break;
                case "3":
                    drawSquare();
                    break;
                case "4":
                    shownumMax();
                    break;
                case "5":
                    shownewRecurLine();
                    break;
                case "6":
                    showRecurRectangle();
                    break;
                case "Q":
                case "q":
                    System.out.println("Bye!");
                    System.exit(0);
                default:
                    System.out.println("'_'");
            }
        } while (sc.hasNext());
    }

}
