
public class simpleLinkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the LinkedList
    Node head = null;

    // METHOD TO INSERT AT THE END
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

    }

    // METHOD TO INSERT AT BEGINNING
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // METHOD TO DISPLAY THE NODE
    public void Display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // METHOD TO INSERT AT POSITION
    public void insertPOsition(int pos, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // METHOD TO DELETE FROM BEGINNING
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    // METHOD TO DELETE FROM END
    public void deleteEnd() {
        if (head == null) {
            System.out.println("Linkedlist is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // METHOD TO DELETE FROM POSITION
    public void DeletePosition(int pos) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        // Traverse to the node just before the target position
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        // Check if the position is valid
        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }
        // Skip the node to be deleted
        temp.next = temp.next.next;

    }

    // METHOD TO SEARCH AN ELEMENT
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {

            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // METHOD TO COUNT NODES
    public int countNode() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        simpleLinkedlist list = new simpleLinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.Display();

        list.insertBeginning(1);
        System.out.println("\nAfter inserting at beginning:");
        list.Display();

        list.insertPOsition(4, 35);
        System.out.println("\nAfter Inserting at position 4");
        list.Display();

        list.deleteFirst();
        System.out.println("\nAfter deleting first Node");
        list.Display();

        list.deleteEnd();
        System.out.println("\nAfter Deleting from End");
        list.Display();

        list.DeletePosition(3);
        System.out.println("\nAfter deleting from position 3");
        list.Display();

        System.out.println("\nSize: " + list.countNode());

        System.out.println("Search 20: " + list.search(20));
        System.out.println("Search 100: " + list.search(100));
    }
}