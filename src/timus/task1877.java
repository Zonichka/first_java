package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1877 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int first = in.nextInt();
        int second = in.nextInt();

        if (first%2 == 0 || second%2 == 1){
            out.println("yes");
        } else {
            out.println("no");
        }
        out.flush();
    }
}

