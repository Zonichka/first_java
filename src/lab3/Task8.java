//package lab3;
//
//
//// Класс Node берем из Task4
//class LinkedListWhile {
//    Node head;
//
//    // Метод ввода с головы
//    public void createHead(int data) {
//        Node newNode = new Node(data, head);
//        head = newNode;
//    }
//
//    // Метод ввода с хвоста
//    public void createTail(int data) {
//        Node newNode = new Node(data, null);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//    }
//
//    // Метод вывода (возвращается строка, сформированная из элементов списка)
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        Node current = head;
//        while (current != null) {
//            result.append(current.value).append(" -> ");
//            current = current.next;
//        }
//        result.append("null");
//        return result.toString();
//    }
//
//    // Метод добавления элемента в начало списка
//    public void addFirst(int data) {
//        createHead(data);
//    }
//
//    // Метод добавления элемента в конец списка
//    public void addLast(int data) {
//        createTail(data);
//    }
//
//    // Метод вставки элемента в список с указанным номером
//    public void insert(int index, int data) {
//        if (index == 0) {
//            createHead(data);
//        } else {
//            Node newNode = new Node(data, null);
//            Node current = head;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.next;
//            }
//            newNode.next = current.next;
//            current.next = newNode;
//        }
//    }
//
//    // Метод удаления элемента с головы списка
//    public void removeFirst() {
//        if (head != null) {
//            head = head.next;
//        }
//    }
//
//    // Метод удаления последнего элемента списка
//    public void removeLast() {
//        if (head == null || head.next == null) {
//            head = null;
//        } else {
//            Node current = head;
//            while (current.next.next != null) {
//                current = current.next;
//            }
//            current.next = null;
//        }
//    }
//
//    // Метод удаления из списка элемента с указанным номером
//    public void remove(int index) {
//        if (index == 0) {
//            removeFirst();
//        } else {
//            Node current = head;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.next;
//            }
//            if (current.next != null) {
//                current.next = current.next.next;
//            }
//        }
//    }
//}
//
//class LinkedListRec {
//    Node head;
//
//    // Метод ввода с головы с использованием рекурсии
//    public void createHeadRec(int data) {
//        head = addToHeadRecursive(head, data);
//    }
//
//<<<<<<< HEAD
//=======
//    @org.jetbrains.annotations.NotNull
//    @org.jetbrains.annotations.Contract("null, _ -> new")
//>>>>>>> origin/master
//    private Node addToHeadRecursive(Node current, int data) {
//        if (current == null) {
//            return new Node(data, null);
//        }
//        current.next = addToHeadRecursive(current.next, data);
//        return current;
//    }
//
//    // Метод ввода с хвоста с использованием рекурсии
//    public void createTailRec(int data) {
//        if (head == null) {
//            head = new Node(data, null);
//        } else {
//            addToTailRecursive(head, data);
//        }
//    }
//
//    private void addToTailRecursive(Node current, int data) {
//        if (current.next == null) {
//            current.next = new Node(data, null);
//        } else {
//            addToTailRecursive(current.next, data);
//        }
//    }
//
//    // Метод вывода (возвращается строка, сформированная из элементов списка) с использованием рекурсии
//    public String toStringRec() {
//        return toStringRecursive(head);
//    }
//
//    private String toStringRecursive(Node current) {
//        if (current == null) {
//            return "null";
//        }
//        return current.value + " -> " + toStringRecursive(current.next);
//    }
//}
//
//public class Task8 {
//    public static void main(String[] args) {
//        // Тестирование методов с использованием цикла
//        LinkedListWhile listIterative = new LinkedListWhile();
//
//        System.out.println("LinkedList с использованием цикла:");
//        listIterative.createHead(3);
//        listIterative.createHead(2);
//        listIterative.createHead(1);
//        System.out.println("Список после ввода с головы: " + listIterative.toString());
//
//        listIterative.createTail(4);
//        listIterative.createTail(5);
//        System.out.println("Список после ввода с хвоста: " + listIterative.toString());
//
//        listIterative.insert(2, 10);
//        System.out.println("Список после вставки элемента: " + listIterative.toString());
//
//        listIterative.removeFirst();
//        System.out.println("Список после удаления с головы: " + listIterative.toString());
//
//        listIterative.removeLast();
//        System.out.println("Список после удаления с хвоста: " + listIterative.toString());
//
//        listIterative.remove(2);
//        System.out.println("Список после удаления элемента по индексу: " + listIterative.toString());
//
//        // Тестирование методов с использованием рекурсии
//        LinkedListRec listRecursive = new LinkedListRec();
//
//        System.out.println("\nLinkedList с использованием рекурсии:");
//        listRecursive.createHeadRec(3);
//        listRecursive.createHeadRec(2);
//        listRecursive.createHeadRec(1);
//        System.out.println("Список после ввода с головы: " + listRecursive.toStringRec());
//
//        listRecursive.createTailRec(4);
//        listRecursive.createTailRec(5);
//        System.out.println("Список после ввода с хвоста: " + listRecursive.toStringRec());
//    }
//}