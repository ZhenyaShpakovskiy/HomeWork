package HomeWork2.utils;

import java.util.Scanner;
import java.util.Random;

public class ArraysUtils {
    public static int[] arrayFromConsole() { // 2.1.1
        Scanner console = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int size = console.nextInt();

        System.out.println("Введите элементы массива");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }

        return arr;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) { // 2.1.2
        Random rand = new Random();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(maxValueExclusion);
        }

        return arr;
    }
}