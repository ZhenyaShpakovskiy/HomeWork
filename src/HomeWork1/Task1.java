package HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a | b);
        System.out.println(a & b);

        /*
            5 = 00000101
            32 = 00100000
            00000101 | 00100000 = 00100101(37)
            00000101 & 00100000 = 00000000(0)
        */

        // System.out.println(42.5 | 11.1); не работает с double;
    }
}
