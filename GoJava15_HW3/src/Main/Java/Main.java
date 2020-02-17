import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        definedArray();
        undefinedArray();
    }

    private static void definedArray() {
        //---
        //int[] ar = {7, 9, 1, 9, 8, 7, 9, 3,3,3,3,3,2,2,2,1,8,2};
        //---
        int size, max, min, five, most, rare;
        five = 0;
        //1
        System.out.println("Size?");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        //2
        int[] ar = new int[size];
        do {
            ar[five] = sc.nextInt();
            five++;
        } while (size > five);
        System.out.println("Your " + size + "-length array is:\n" + Arrays.toString(ar));
        max = ar[0];
        min = ar[0];
        five = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            //3
            if (max < ar[i + 1]) {
                max = ar[i + 1];
            }
            //4
            if (min > ar[i + 1]) {
                min = ar[i + 1];
            }
            //5.1
            if (ar[i] == 5) {
                five++;
            }
        }
        //5.2
        if (ar[ar.length - 1] == 5) {
            five++;
        }
        //6
        Arrays.sort(ar);
        //7.1, 8.1
        int[] temp = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    temp[i] += 1;
                }
            }
        }
        //7.2
        most = 0;
        for (int i = 0; i < temp.length; i++) {
            if (most < temp[i]) {
                most = temp[i];
            }
        }
        //8.2
        rare = temp[0];
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] == 1) {
                if (rare > temp[i + 1]) {
                    rare = temp[i + 1];
                }
            }
        }
        //Output
      /*  System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(temp));
        System.out.println(most + " " + rare);*/
        System.out.print("The oftenest numbers are:");
        for (int i = 0; i < ar.length; i++) {
            if (temp[i] == most) {
                System.out.print(" " + ar[i]);
            }
        }
        System.out.println();
        System.out.print("The rarest numbers are:");
        if (temp[0] == rare) {
            System.out.print(" " + ar[0]);
        }
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] == 1) {
                if (temp[i + 1] == rare) {
                    System.out.print(" " + ar[i + 1]);
                }
            }
        }
        System.out.println();

        System.out.print("Min " + min + "\nMax " + max + "\nFive " + five);
    }

    private static void undefinedArray() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] splitted = s.split(" ");
        int[] ar = new int[splitted.length];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(splitted[i]);
        }
        System.out.println(Arrays.toString(ar));
    }
}
