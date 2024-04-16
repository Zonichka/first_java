package lab3;
import java.util.*;

// В task7  закомментирован код, так как там происходит перегрузка типа LinkedList
public class Speed {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arraydeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции поиска 700000 элемента arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции поиска 700000 элемента linkedList = " + getRunningTime(linkedList));
//        System.out.println("Время выполнения поиска  = " + getRunningTime(arraydeque));
    }

    private static long getRunningTime(List<Integer> collection){

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 7000000; i++) {
            collection.add(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.nanoTime();
        collection.get(700000);
        // точка окончания отсчета времени выполнения программы
        long end = System.nanoTime();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}

