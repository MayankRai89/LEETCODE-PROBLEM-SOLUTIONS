public class MergeSortLinkedlist {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

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

    // Print Linked List
    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge Sort
    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    // Find Middle
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge Two Sorted Lists
    public Node merge(Node left, Node right) {

        Node mergell = new Node(-1);
        Node temp = mergell;

        while (left != null && right != null) {

            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        if (left != null)
            temp.next = left;

        if (right != null)
            temp.next = right;

        return mergell.next;
    }

    // Main Function
    public static void main(String[] args) {

        MergeSortLinkedlist list = new MergeSortLinkedlist();

        list.insert(5);
        list.insert(2);
        list.insert(8);
        list.insert(1);
        list.insert(3);
        list.insert(2);
        list.insert(7);

        System.out.println("Original Linked List:");
        list.printList(list.head);

        list.head = list.mergeSort(list.head);

        System.out.println("\nSorted Linked List:");
        list.printList(list.head);
    }
}