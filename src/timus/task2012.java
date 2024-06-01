package timus;
import java.io.PrintWriter;
import java.util.Scanner;

public class task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int target = 12;
        int max_task = 5;
        int f =  in.nextInt();

        if (target - f <= max_task) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.flush();
    }
}
