package HomeWork1;

public class Task4_1 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        if (a % 2 != 0 && b % 2 != 0 || a % 2 == 0 && b % 2 == 0) {
            a += 1;
        }
        if (a % 2 == 0) {
            System.out.println("нечетное число - " + b);
        } else {
            System.out.println("нечетное число - " + a);
        }
    }
}
