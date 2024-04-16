package lab3;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для перевода в двоичную систему: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binaryNumber = convertDecimalToBinary(decimalNumber);

        System.out.println("Двоичное представление числа " + decimalNumber + " равно " + binaryNumber);
    }

    public static String convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        } else if (decimalNumber == 1) {
            return "1";
        } else {
            int remainder = decimalNumber % 2;
            int quotient = decimalNumber / 2;
            return convertDecimalToBinary(quotient) + String.valueOf(remainder);
        }
    }
}
