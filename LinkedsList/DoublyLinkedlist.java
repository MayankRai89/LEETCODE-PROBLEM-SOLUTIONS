
public class DoublyLinkedlist {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // METHOD TO ADD AT END NODE
    public void insert(int data) {
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
        newNode.prev = temp;
    }

    // METHOD TO INSERT AT BEGINING NODE
    public void insertBegining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayback() {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }
        Node temp = head;
        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }
        // Traverse backward
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DoublyLinkedlist list = new DoublyLinkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.print();

        System.out.println("\nLinked List in backward: - ");
        list.displayback();

        System.out.println("\nList after Inserting at begining: - ");
        list.insertBegining(0);
        list.print();
    }

}
