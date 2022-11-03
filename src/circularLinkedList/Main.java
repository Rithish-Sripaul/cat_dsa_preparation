package circularLinkedList;

class circLinkedList {
    Node head;
    Node tail;

    void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
            head.next = tail;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
            tail.next = head;
        }

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    void insertPos(int data, int pos) {
        if (head == null || pos == 0) {
            insertFront(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        while (count != pos - 1) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeFront() {
        head = head.next;
        tail.next = head;
    }

    void removeEnd() {
        Node temp = head;

        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    void display() {
        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        circLinkedList cll = new circLinkedList();
        cll.insertFront(1);
        cll.insertFront(2);
        cll.insertEnd(3);
        cll.display();
        cll.insertPos(4, 1);
        cll.display();
        cll.insertPos(5, 2);
        cll.display();
    }
}
