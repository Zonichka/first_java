package lab1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("x = ");
        int x = in.nextInt();
        int x1 = x-1; // инкрементом и декрементом пользоваться нельзя, так как они меняют значение изначальной переменной
        int x2 = x+1;
        int x3 = (x1 + x2 + x)*(x1 + x2 + x);
        System.out.println(x1 + " " + x + " " + x2 + " " + x3);
        in.close();
    }
}
