package lab4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример матрицы
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        try {
            System.out.println("Введите номер столбца, который нужно вывести (начиная с 0):");
            String input = scanner.nextLine();
            int columnIndex = Integer.parseInt(input);

            if (columnIndex < 0 || columnIndex >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Столбец с таким номером не существует.");
            }

            System.out.println("Элементы столбца " + columnIndex + ":");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][columnIndex]);
            }

        } catch (NumberFormatException e) {
            System.err.println("Ошибка ввода: введите целое число.");
        } finally {
            scanner.close();
            System.out.println("Программа завершена.");
        }
    }
}
