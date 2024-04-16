package lab3;

// Класс Node берем из Task4
class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addNodeAtHead(int data) {
        Node newNode = new Node(data, head);
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    public void addNodeAtTail(int data) {
        Node newNode = new Node(data, null);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Task7 {
    public static void main(String[] args) {
        LinkedList listFromHead = new LinkedList();
        System.out.println("Список с головы:");
        listFromHead.addNodeAtHead(1);
        listFromHead.printList();
        listFromHead.addNodeAtHead(2);
        listFromHead.printList();
        listFromHead.addNodeAtHead(3);
        listFromHead.printList();

        LinkedList listFromTail = new LinkedList();
        System.out.println("\nСписок с хвоста:");
        listFromTail.addNodeAtTail(1);
        listFromTail.printList();
        listFromTail.addNodeAtTail(2);
        listFromTail.printList();
        listFromTail.addNodeAtTail(3);
        listFromTail.printList();
    }
}
