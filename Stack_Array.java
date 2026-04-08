
import java.util.Scanner;

public class Stack_Array {
    private int[] arr;
    private int capacity;
    private int topidx;

    // constructor to initiallize stack
    public Stack_Array(int size) {
        capacity = size;
        arr = new int[capacity];
        // initialize stack as empty
        topidx = -1;
    }

    // Push element onto the stack
    public void push(int x) {
        if (topidx == capacity - 1) {
            System.out.println("stack overflow");
            return;
        }
        arr[++topidx] = x;
    }

    public int pop() {
        if (topidx == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[topidx--];
    }

    public int peek() {
        if (topidx == -1) {
            return -1;
        }
        return arr[topidx];
    }

    public boolean isEmpty() {
        return topidx == -1;
    }

    public void Display() {
        if (topidx == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = topidx; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int n = sc.nextInt();
        Stack_Array stack = new Stack_Array(n);
        System.out.println("Enter the elements to push: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            stack.push(val);
        }
        System.out.print("Stack elements: ");
        stack.Display();

        // System.out.println("Top elements: " + stack.peek());
        // System.out.println("Poped elements: " + stack.pop());
        // System.out.println("Stack after pop: ");
        // stack.Display();
        sc.close();
    }
}
