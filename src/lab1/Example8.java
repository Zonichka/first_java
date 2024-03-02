package lab1;

import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название текущего дня недели: ");
        String weekday = in.nextLine();
        System.out.println("Введите название месяца: ");
        String month = in.nextLine();
        System.out.println("Введите дату: ");
        Integer day = in.nextInt();
        System.out.println("Сегодня " + weekday + day + month);
        in.close();
    }
}
