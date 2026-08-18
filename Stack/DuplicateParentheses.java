
import java.util.Stack;

public class DuplicateParentheses {
    public static boolean isDuplicate(String st) {
        Stack<Character> stack = new Stack<>();
        for (char ch : st.toCharArray()) {
            if (ch == ')') {
                int count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                if (count == 0) {
                    return true;
                }
            } else {

                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String st = "(((a + (b))) + (c + d))";
        System.out.println(isDuplicate(st));
    }
}
