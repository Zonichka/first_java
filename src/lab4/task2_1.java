package lab4;

import java.util.Scanner;
public class task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите элементы массива (целые числа) через пробел:");
            String inputLine = scanner.nextLine();
            String[] inputStrings = inputLine.split("\\s+");
            int[] array = new int[inputStrings.length];

            for (int i = 0; i < inputStrings.length; i++) {
                try {
                    array[i] = Integer.parseInt(inputStrings[i]);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Ошибка: введено не число - '" + inputStrings[i] + "'.");
                }
            }

            double average = calculateAverage(array);
            System.out.println("Среднее значение среди положительных элементов: " + average);

        } catch (NumberFormatException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (NoPositiveElementsException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Программа завершена.");
        }
    }

    public static double calculateAverage(int[] array) throws NoPositiveElementsException {
        int sum = 0;
        int count = 0;

        for (int value : array) {
            if (value > 0) {
                sum += value;
                count++;
            }
        }

        if (count == 0) {
            throw new NoPositiveElementsException("В массиве отсутствуют положительные элементы.");
        }

        return (double) sum / count;
    }
}

class NoPositiveElementsException extends Exception {
    public NoPositiveElementsException(String message) {
        super(message);
    }
}
