package HomeWork2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        double number = number();
        int degree = degree();
        System.out.println(result(number, degree));
    }

    public static double result(double a, int b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public static double number() {
        Scanner console = new Scanner(System.in);
        double number;
        System.out.println("Введите число");
        while (!console.hasNextDouble()) {
            System.out.println("Введено не число");
            console.next();
        }
        number = console.nextDouble();
        return number;
    }

    public static int degree() {
        Scanner console = new Scanner(System.in);
        int degree;
        do {
            System.out.println("Введите целое положительное число");
            while (!console.hasNextInt()) {
                System.out.println("Введено не целое положительное число");
                console.next();
            }
            degree = console.nextInt();
        } while (degree <= 0);
        return degree;
    }
}