package timus;

import java.util.Scanner;
public class task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String N = in.next();
        String A = in.next();
        String B = in.next();


        System.out.println(Integer.parseInt(N.trim()) * Integer.parseInt(A.trim()) * Integer.parseInt(B.trim()));
        in.close();
    }
}
