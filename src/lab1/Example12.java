package lab1;

import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько Вам лет?: ");
        Integer year0 = in.nextInt();
        System.out.println("Введите текущий год: ");
        Integer year1 = in.nextInt();
        System.out.println("Вы родились в " + (year1 - year0));
        in.close();
    }
}
