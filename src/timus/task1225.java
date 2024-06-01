package timus;

import java.util.Scanner;
import java.util.Vector;
public class task1225 {
    public static void main(String[] args) {
        int N = 45;
        int M;
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();

        Vector<Long> a = new Vector<Long>(N + 2);
        a.add((long) 2);
        a.add((long) 2);

        for (int i = 0; i < N; i++) {
            a.add(a.get(i + 1) + a.get(i));
        }

        // Fibonacci sequence
        // F0 = 2;
        // F1 = 2;
        // Fn = Fn-1 + Fn-2

        System.out.println(a.get(M - 1));
    }
}
