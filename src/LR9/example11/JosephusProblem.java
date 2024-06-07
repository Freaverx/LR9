package LR9.example11;

import java.util.LinkedList;

public class JosephusProblem {
    public static void main(String args) {
        // Ввод количества людей в круге
        int n = 10;

        // Создание списка людей
        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        // Моделирование процесса вычеркивания
        int m = 2; // Шаг вычеркивания
        int survivorIndex = 0; // Индекс выжившего
        while (people.size() > 1) {
            for (int i = m - 1; i < people.size(); i += m) {
                people.remove(i);
            }
            m++;
            survivorIndex = (survivorIndex + 1) % people.size();
        }

        // Вывод результата
        System.out.println("Выживший: " + people.getFirst());
    }
}
