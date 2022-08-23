package HomeWork1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число от 0 до 127");
        int number = console.nextInt();

        if (number >= 65 && number <= 90){
            System.out.println("Ваш код соответствует латинской букве");
        } else if (number >= 97 && number <= 122){
            System.out.println("Ваш код соответствует латинской букве");
        }else{
            System.out.println("Ваш код соответствует символу");
        }
    }
}

