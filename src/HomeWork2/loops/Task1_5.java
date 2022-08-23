package HomeWork2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        System.out.println("Наибольшая цифра числа: " + maxNumber());
        System.out.println("Из 1000 чисел " + probOfNum() + " четные.");
        System.out.println(calcNums());
        System.out.println(fib());
        System.out.println(numRow());
        System.out.println(reverseNum());
    }

    public static int maxNumber() { // 1.5.1
        Scanner console = new Scanner(System.in);

        System.out.print("Введите натуральное число");
        int num = console.nextInt();


        int numCopy = 0;
        while (num > 0) {
            if (numCopy > num % 10) {
                num /= 10;
            } else {
                numCopy = num % 10;
                num /= 10;
            }
        }
        return numCopy;
    }

    public static int probOfNum() { //1.5.2
        int counter = 0;
        Random rand = new Random();

        for (int i = 0; i <= 1000; i++) {
            if (rand.nextInt() % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static String calcNums() { // 1.5.3
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число");
        int num = in.nextInt();

        int countEven = 0;
        int countOdd = 0;
        String even = "";
        String odd = "";
        while (num > 0) {
            int a = num % 10;
            if (a % 2 == 0) {
                countEven++;
                even = a + even;
            } else {
                countOdd++;
                odd = a + odd;
            }
            num = num / 10;
        }
        String result = "В числе " + countEven + " четных цифр (" + even + "), и " + countOdd + " нечетных (" + odd + ")";
        return result;
    }

    public static String fib() { // 1.5.4
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину ряда");
        int len = in.nextInt();
        String str = "";
        if (len == 0) {
            System.out.println("");
        } else if (len == 1) {
            System.out.println("0");
        } else {
            str = "0 1";

            long num1 = 0;
            long num2 = 1;
            long numCopy = 0;

            for (int i = 0; i < len - 2; i++) {
                str += " " + (num1 + num2);
                numCopy = num2;
                num2 = num1 + num2;
                num1 = numCopy;
            }
        }
        return str;
    }

    public static String numRow() { // 1.5.5
        Scanner in = new Scanner(System.in);

        System.out.println("Введите минимальное значение");
        int min = in.nextInt();
        System.out.print("Введите максимальное значение");
        int max = in.nextInt();
        System.out.print("Введите шаг");
        int step = in.nextInt();
        String str = "";


        for (int i = min; i <= max; i += step) {
            str += i + " ";
        }

        return str;
    }

    public static String reverseNum() { // 1.5.6
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число");
        int num = in.nextInt();
        String str = "";

        while (num > 0) {
            str += num % 10;
            num /= 10;
        }

        return str;
    }
}