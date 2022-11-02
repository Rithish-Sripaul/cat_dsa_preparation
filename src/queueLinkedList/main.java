package queueLinkedList;

class queue {
    Node head;

    void enqueue(int data) {  // Insert Front
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

    void dequeue() {
        head = head.next;
    }

    void peek() {
        System.out.println(head.data);
    }

    void display(){
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
public class main {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.peek();
        q.dequeue();
        q.display();
        q.peek();
    }
}
