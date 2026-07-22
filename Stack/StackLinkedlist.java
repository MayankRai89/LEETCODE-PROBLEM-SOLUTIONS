public class StackLinkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedStack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // PUSH
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // POP
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // PEEK
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        // PUSH AT BOTTOM
        public void pushAtBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            pushAtBottom(data);
            push(top);
        }
    }

    public static void main(String args[]) {
        LinkedStack s = new LinkedStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pushAtBottom(6);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
