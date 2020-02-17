package Main.Java;

import java.util.Scanner;

public class Main {
    static String asker() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("q") || s.equals("Q") || s.equals("quit") || s.equals("Quit")) {
            System.exit(111);
        }
        return s;
    }

    static int ageAsker() {
        Scanner sc = new Scanner(System.in);
        String s;
        int i;
        while (true) {
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                if (i > 0 && i < 150) {
                    return i;
                } else {
                    System.out.println("Age?\n");
                }
            } else {
                s = sc.nextLine();
                if (s.equals("q") || s.equals("Q") || s.equals("quit") || s.equals("Quit")) {
                    System.exit(222);
                } else {
                    System.out.println("Age?\n");
                }
            }
        }
    }

    static void filling() {
        String name = asker();
        System.out.println(name);
        String city = asker();
        System.out.println(city);
        int age = ageAsker();
        System.out.println(age);
        String hobby = asker();
        System.out.println(hobby + "\n\n");

        System.out.println("Name: " + name + "\nCity: " + city + "\nAge: " + age + "\nHobby: " + hobby);
    }

    public static void main(String[] args) {
        filling();
    }
}