class Node {
    int data;
    Node next;
    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    void add(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    void count() {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        System.out.println("Number of nodes: " + count);
    }
}

public class countnumberlinkedlist {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.count();
        l.display();
    }
}
