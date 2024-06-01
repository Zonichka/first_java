package timus;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class task1880 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        HashMap<Integer, Integer> numbers = new HashMap<>();
        int num, repeats, result = 0;

        for (int i = 0; i < 3; i++) {
            repeats = in.nextInt();
            for (int j = 0; j < repeats; j++) {
                num = in.nextInt();
                if (numbers.containsKey(num)) {
                    numbers.put(num, numbers.get(num) + 1);
                } else if (i == 0) {
                    numbers.put(num, 1);
                }
            }
        }
        for (int value: numbers.values()) {
            if (value == 3) {
                result += 1;
            }
        }

        out.println(result);
        out.flush();
    }
}
