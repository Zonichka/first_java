package lab3;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cucumber");
        hashMap.put(4, "Dates");
        hashMap.put(5, "Eggplant");
        hashMap.put(6, "Fig");
        hashMap.put(7, "Grapes");
        hashMap.put(8, "Honeydew");
        hashMap.put(9, "Jackfruit");
        hashMap.put(10, "Kiwi");

        String stringsKeyGreaterThan5 = "";
        int multiplicationResult = 1;

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if (key > 5) {
                stringsKeyGreaterThan5 += value + " ";
            }

            if (key == 0) {
                System.out.println("Строки с ключом 0: " + value);
            }

            if (value.length() > 5) {
                multiplicationResult *= key;
            }
        }

        System.out.println("Строки с ключами больше 5: " + stringsKeyGreaterThan5);
        System.out.println("Произведение ключей с длиной строки больше 5: " + multiplicationResult);
    }
}
