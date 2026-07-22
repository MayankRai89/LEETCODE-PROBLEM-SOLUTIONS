import java.util.Stack;

public class ValidParentesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty())
                    return false;
                char top = st.pop();
                if (c == ')' && top != '(')
                    return false;
                if (c == '}' && top != '{')
                    return false;
                if (c == ']' && top != '[')
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String[] tests = { "()", "()[]{}", "(]", "([)]", "{[]}", "", ")(" };
        for (String t : tests) {
            System.out.println(t + " -> " + isValid(t));
        }
    }

}
