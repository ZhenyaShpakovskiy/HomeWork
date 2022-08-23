package HomeWork2.loops;

public class Task1_6 {
    public static void main(String[] args) {
        System.out.println(table());
    }

    public static String table() {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j < 6; j++) {
                str += j + " x " + i + " = " + j * i + "\t";
                if (j == 5) {
                    str += "\n";
                }
            }
        }

        str += "\n";

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j < 10; j++) {
                str += j + " x " + i + " = " + j * i + "\t";
                if (j == 9) {
                    str += "\n";
                }
            }
        }
        return str;
    }
}
