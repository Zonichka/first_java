package timus;

import java.util.Scanner;

public class task1639 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if ((n * m) % 2 == 0) {
            System.out.println("[:=[first]");
        } else {

            System.out.println("[second]=:]");
        }
    }
}
