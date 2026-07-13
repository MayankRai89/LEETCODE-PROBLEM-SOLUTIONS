public class SearchingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at end
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

    // Iterative Search
    public int searchIterative(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // METHOD TO SEARCH RECURSIVELY
    public int searchRecursive(int key) {
        return helper(head, key);
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
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

        SearchingLinkedList list = new SearchingLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.display();

        System.out.println("Search 20: " + list.searchIterative(20));
        System.out.println("Search 70: " + list.searchIterative(70));
        System.out.println("Search 100: " + list.searchIterative(100));

        System.out.println("Search recursive 10: " + list.searchRecursive(10));
        System.out.println("Search recursive 30: " + list.searchRecursive(30));
        System.out.println("Search recursive 50: " + list.searchRecursive(50));
        System.out.println("Search recursive 100: " + list.searchRecursive(100));
    }
}