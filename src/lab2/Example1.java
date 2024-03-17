package lab2;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random random= new Random();
        int n = (int) (Math.random() * 20);

        int[] randomMas = new int[n];
        for (int i = 0; i < n; i++) {
            randomMas[i] = random.nextInt(100);
        }
        for (int value : randomMas) {
            System.out.print(value+" ");
        }
        int minimum = randomMas[0];
        for (int i = 1; i < randomMas.length; i++) {
            if (minimum > randomMas[i])
                minimum = randomMas[i];
        }
        System.out.println("Минимальное значение: " + minimum);
        System.out.print("Индексы элементов с минимальным значением: ");
        for (int i = 0; i < randomMas.length; i++) {
            if (randomMas[i] == minimum) {
                System.out.print(i + " ");
            }
        }
    }
}
