package HomeWork2.loops;

import java.util.Scanner;

public class Task1_1_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        long a = console.nextLong();

        System.out.println(factorial(a));
    }

    public static String factorial(long n) {
        long result = 1;
        String resStr = "";
        for (int i = 1; i <= n; i++) {
            result *= i;

            if (i == n) {
                resStr += i;
            } else {
                resStr += i + " * ";
            }
        }
        return resStr + " = " + result;
    }
}
