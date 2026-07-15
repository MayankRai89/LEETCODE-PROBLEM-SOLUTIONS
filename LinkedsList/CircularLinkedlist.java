public class CircularLinkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // METHOD TO CREATE A CIRCULAR LINKEDLIST
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // METHOD TO DISPLAY CIRCULAR LINKEDLIST
    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedlist list = new CircularLinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
    }
}
