package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] measure = new int[6];

        int result1, result2;

        for (int i = 0; i < 6; i++) {
            measure[i] = in.nextInt();
        }

        result1 = measure[0] - measure[4];
        result2 = measure[1] - measure[3];

        out.printf("%d %d", result1, result2);
        out.flush();
    }
}
