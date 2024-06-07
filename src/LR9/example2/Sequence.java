package LR9.example2;

public class Sequence {
    public static void main(String args) {
        int x = 11; // начальное значение
        System.out.println(x);
        while (x > 0) {
            x = x / 2; // вычисляем следующее значение
            System.out.println(x);
        }
    }
}
