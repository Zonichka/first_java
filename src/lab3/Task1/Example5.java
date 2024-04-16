package lab3.Task1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    public static int fact(int n) {
        System.out.println("Calling fib(" + n + ")");
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 2)+ fact(n - 1);
        }
    }
}