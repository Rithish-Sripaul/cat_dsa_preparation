package linkedList;

class ll {
    Node head;

//  Inserting a node at the start, end, at the middle and at any position
//  Deleting a node at the start, end, and at any position
//  Displaying a node

    void insertFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertPos(int data, int pos) {
        if (pos == 0) {
            insertFront(data);
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

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeFront(){
         head = head.next;
    }

    void removeEnd() {
        Node temp = head;

        while (temp.next != null) {
            temp.next = null;
        }
    }

    void removePos(int pos) {
        if (pos == 0) {
            removeFront();
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            if (count == pos - 1) {
                break;
            }
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linked_list {
    public static void main(String[] args) {
        ll l = new ll();
        l.insertFront(12);
        l.insertEnd(2);
        l.insertFront(1);
        l.insertPos(3, 2);
        l.display();
        l.removePos(2);
        l.display();
        l.removeFront();
        l.display();
        l.removeEnd();
        l.display();
    }
}
