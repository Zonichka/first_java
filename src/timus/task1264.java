package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n, m;

        n = in.nextInt();
        m = in.nextInt();

        out.println(n * (m + 1));
        out.flush();
    }
}
