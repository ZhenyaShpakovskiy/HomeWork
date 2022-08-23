package HomeWork2.loops;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите целое число");
            while (!console.hasNextInt()) {
                System.out.println("Введено не число");
                console.next();
            }
            number = console.nextInt();
        } while (number % 1 > 0);

        System.out.println(result(number));
    }

    public static String result(int n) {
        long result = 1;
        String line = "";

        while (n > 9) {
            int a = n % 10;
            n = n / 10;
            result = result * a;
            line = " * " + a + line;
        }
        result = result * n;
        line = n + line;

        return (line + " = " + result);
    }
}

