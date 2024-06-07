package LR9.example9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создание HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Добавление элементов в HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Coconut");
        map.put(4, "Durian");
        map.put(5, "Eggplant");
        map.put(6, "Fig");
        map.put(7, "Grapes");
        map.put(8, "Honeydew");
        map.put(9, "Kiwi");
        map.put(10, "Lemon");

        // Поиск строк, у которых ключ > 5
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            if (entry.getKey() > 5) {
                System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
            }
        }

        // Вывод строк через запятую, если ключ = 0
        if (map.containsKey(0)) {
            System.out.println("Строки через запятую: " + map.get(0));
        }

        // Перемножение всех ключей, где длина строки > 5
        int result = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                result *= entry.getKey();
            }
        }

        System.out.println("Результат перемножения: " + result);
    }
}
}
