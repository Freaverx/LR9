package LR9.example6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        System.out.println(toBinary(num));
    }

    private static String toBinary(int num) {
        if (num == 0) {
            return "";
        } else {
            return toBinary(num / 2) + num % 2;
        }
    }
}
