package lab1;

import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("x1 = ");
        Integer year0 = in.nextInt();
        System.out.println("x2 = ");
        Integer year1 = in.nextInt();
        int sum = year1+year0;
        System.out.println(sum);
        in.close();
    }
}
