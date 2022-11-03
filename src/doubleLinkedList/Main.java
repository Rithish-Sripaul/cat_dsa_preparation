package doubleLinkedList;

class dll {
    Node head;
    Node tail;

    void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.prev = head;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void insertPos(int data, int pos) {
        if (pos == 0) {
            removeFront();
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        while (temp.next != null) {
            if (count == pos - 1) {
                break;
            }
            temp = temp.next;
            count++;
        }

        temp.next.prev = newNode;
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
    }

    void displayFront() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayEnd() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void removeFront() {
        head = head.next;
        head.prev = null;

    }

    void removeEnd() {
        tail = tail.prev;
        tail.next = null;
    }

    void removePos(int pos) {
        Node temp = head;
        int count = 0;

        while (temp.next != null) {
            if (count == pos - 1) {
                break;
            }
            temp = temp.next;
            count++;
        }

        temp.next.next.prev = temp;
        temp.next = temp.next.next;
    }
}


class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class Main {
    public static void main(String[] args) {
        dll d = new dll();
        d.insertFront(1);
        d.insertFront(2);
        d.insertFront(3);
        d.insertEnd(12);
        d.displayFront();
        d.displayEnd();
        d.insertPos(4, 1);
        d.displayFront();
        d.displayEnd();
        d.insertPos(5, 3);
        d.displayFront();
        d.displayEnd();
        d.removePos(1);
        d.displayFront();
        d.displayEnd();
    }
}
