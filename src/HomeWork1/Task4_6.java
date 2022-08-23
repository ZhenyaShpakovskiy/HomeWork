package HomeWork1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");
        int year = console.nextInt();

        if (year % 4 != 0) {
            System.out.println("Год " + year + " обычный");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Год " + year + " високосный.");
            } else {
                System.out.println("Год " + year + " обычный.");
            }
        } else {
            System.out.println("Год " + year + " високосный.");
        }
    }
}
