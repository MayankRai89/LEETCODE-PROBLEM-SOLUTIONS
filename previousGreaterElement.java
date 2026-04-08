import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class previousGreaterElement {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
