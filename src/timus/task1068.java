package timus;

import java.util.Scanner;
public class task1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;
        if (N >= 1) {
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
        } else {
            for (int i = N; i <= 1; i++) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
