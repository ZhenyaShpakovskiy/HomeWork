package HomeWork1;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int amount = console.nextInt();
        System.out.println("Введите 1 если хотите перевести в байты или 2, если в килобайты");
        int type = console.nextByte();

        if (type == 1) {
            System.out.println(amount * 1024 + " байт");
        } else if (type == 2) {
            System.out.println(amount / 1024d + " килобайт");
        } else {
            System.out.println("Только 1 или 2");
        }
    }
}
