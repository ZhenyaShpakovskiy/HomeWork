package HomeWork1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int a = console.nextInt();
        System.out.print("Введите второе число ");
        int b = console.nextInt();

        if (a % b != 0) {
            System.out.println("Число " + a + " не делится на число " + b + " без остатка.");
            System.out.println("Частное = " + a / b);
            System.out.println("Остаток от деления = " + a % b);
        } else {
            System.out.println("Число " + a + " делится на число " + b + " без остатка.");
            System.out.println("Частное = " + a / b);
        }
    }
}
