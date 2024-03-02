package lab1;

import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите год рождения: ");
        Integer year0 = in.nextInt();
        System.out.println("Введите текущий год: ");
        Integer year1 = in.nextInt();
        System.out.println(name + ", вам " + (year1 - year0));
        in.close();
    }
}