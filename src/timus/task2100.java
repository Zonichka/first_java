package timus;

import java.util.Scanner;
public class task2100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 2;
        for (int i = 0; i < n; i++) {
            String people = scanner.next();
            c += people.endsWith("+one") ? 2 : 1;
        }
        if (c == 13) {
            c++;
        }
        System.out.println(c * 100);
    }
}