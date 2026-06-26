import java.util.ArrayList;

public class StackAraayList {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public static void push(int data) {
            list.add(data);
        }

        // Pop
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}