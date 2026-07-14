public class DeleteNthnode {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // METHOD TO CREATE LINKEDLIST
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

    // METHOD TO DELETE Nth NODE FROM LINKEDLIST
    public void deleteNth(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        if (key == 0) {
            head = head.next;
        }
        for (int i = 0; i < key - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    // METHOD TO DISPLAY LINKEDLIST
    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DeleteNthnode list = new DeleteNthnode();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.display();
        list.deleteNth(5);
        list.display();

    }
}
