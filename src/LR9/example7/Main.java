package LR9.example7;

import java.util.Scanner;

public class Main {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        fillArray(array, size);
        System.out.println("Массив: " + printArray(array, size));
    }

    private static void fillArray(int[] array, int size) {
        if (size > 0) {
            System.out.print("Введите элемент массива: ");
            array[size - 1] = scanner.nextInt();
            fillArray(array, size - 1);
        }
    }

    private static String printArray(int[] array, int size) {
        if (size > 0) {
            return printArray(array, size - 1) + ", " + array[size - 1];
        } else {
            return "";
        }
    }
}
