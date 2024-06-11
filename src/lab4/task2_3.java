package lab4;
import java.util.Scanner;
public class task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите элементы массива (целые числа в диапазоне от -128 до 127) через пробел:");
            String inputLine = scanner.nextLine();
            String[] inputStrings = inputLine.split("\\s+");
            byte[] array = new byte[inputStrings.length];

            for (int i = 0; i < inputStrings.length; i++) {
                try {
                    int value = Integer.parseInt(inputStrings[i]);
                    if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                        throw new NumberFormatException("Ошибка: значение '" + inputStrings[i] + "' выходит за границы диапазона типа byte.");
                    }
                    array[i] = (byte) value;
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Ошибка: введено некорректное число - '" + inputStrings[i] + "'.");
                }
            }

            int sum = calculateSum(array);
            System.out.println("Сумма элементов массива: " + sum);

        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Программа завершена.");
        }
    }

    public static int calculateSum(byte[] array) {
        int sum = 0;
        for (byte value : array) {
            sum += value;
            // Проверка на переполнение
            if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                throw new ArithmeticException("Ошибка: переполнение при вычислении суммы.");
            }
        }
        return sum;
    }
}
