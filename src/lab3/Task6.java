package lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько человек? ");
        int N = scanner.nextInt();

        long startTimeArrayList = System.nanoTime();
        useArrayList(N);
        long endTimeArrayList = System.nanoTime();
        long durationArrayList = (endTimeArrayList - startTimeArrayList) / 1000000; // Время в миллисекундах

        long startTimeLinkedList = System.nanoTime();
        useLinkedList(N);
        long endTimeLinkedList = System.nanoTime();
        long durationLinkedList = (endTimeLinkedList - startTimeLinkedList) / 1000000; // Время в миллисекундах

        System.out.println("Время выполнения метода с ArrayList: " + durationArrayList + " мс");
        System.out.println("Время выполнения метода с LinkedList: " + durationLinkedList + " мс");
    }

    public static void useArrayList(int N) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        System.out.println("Выживший человек (ArrayList): " + people.getFirst());
    }

    public static void useLinkedList(int N) {
        List<Integer> people = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        System.out.println("Выживший человек (LinkedList): " + people.getFirst());
    }
}

