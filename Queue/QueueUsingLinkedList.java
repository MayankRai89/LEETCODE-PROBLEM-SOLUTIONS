public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;

            // Single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }

            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data;
        }

        // display
        public static void display() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return;
            }

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        // Add elements
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Display queue
        System.out.println("Queue:");
        q.display();

        // Peek
        System.out.println("Peek: " + q.peek());

        // Remove
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        // Display after removal
        System.out.println("Queue after removal:");
        q.display();

        // Peek again
        System.out.println("Peek: " + q.peek());
    }
}
