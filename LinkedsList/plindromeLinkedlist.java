
public class plindromeLinkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    Node head = null;

    // METHOD TO CREATE LINKED LIST
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

    // METHOD TO DISPLAY NODE
    public void Display() {
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

    // METHOD TO FIND MID
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // METHOD TO FIND PALINDROME
    public boolean checkPlaindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // find MID
        Node midNode = findMid(head);

        // REVERSE 2ND HALF
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // CHECK LEFT HALF AND RIGHT HALF
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        plindromeLinkedlist list = new plindromeLinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.Display();
        System.out.print("Is the given Linked list is Palindrom :- " + list.checkPlaindrome());
    }
}
