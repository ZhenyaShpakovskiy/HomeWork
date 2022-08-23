package HomeWork2.arrays;

import HomeWork2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromConsole();

        allElements(container);
        secondElement(container);
        reverse(container);
    }

    public static void allElements(int[] container) {
        int i = 0;
        do {
            System.out.print(container[i] + " ");
            i++;
        } while (i < container.length);
        System.out.println();

        int j = 0;
        while (j < container.length) {
            System.out.print(container[j] + " ");
            j++;
        }
        System.out.println();

        for (int index = 0; index < container.length; index++) {
            System.out.print(container[index] + " ");
        }
        System.out.println();

        for (int element : container) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void secondElement(int[] container) {

        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(container[i] + " ");
            }
            i++;
        } while (i < container.length);
        System.out.println();

        int j = 0;
        while (j < container.length) {
            if (j % 2 != 0) {
                System.out.print(container[j] + " ");
            }
            j++;
        }
        System.out.println();

        for (int element = 0; element < container.length; element++) {
            if (element % 2 != 0) {
                System.out.print(container[element] + " ");
            }
        }
        System.out.println();

        // Цикл ForEach обращается к каждому элементу массива, поэтому тут не применим


    }

    public static void reverse(int[] container) {
        int i = container.length - 1;
        do {
            System.out.print(container[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();

        int j = container.length - 1;
        while (j >= 0) {
            System.out.print(container[j] + " ");
            j--;
        }
        System.out.println();

        for (int element = container.length - 1; element >= 0; element--) {
            System.out.print(container[element] + " ");
        }
        System.out.println();

        // Цикл ForEach обращается к каждому элементу массива, поэтому тут не применим
    }
}
