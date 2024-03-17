package lab2;

import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine().toUpperCase();

        System.out.println("Введите ключ (число от 1 до 25):");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        scanner.nextLine(); // Считываем лишний перевод строки после ввода числа
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                // Здесь 26 -  полный цикл АНГЛИЙСКОГО алфавита, поэтому обратное преобразование
                // будет работать только для этого алфавита, на русском не сработает
                char shiftedChar = (char) ('A' + (ch - 'A' + key) % 26);
                result.append(shiftedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key); // Обратное преобразование с ключом = 26 - исходный ключ
    }
}
