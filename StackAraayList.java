
import java.util.ArrayList;

public class StackAraayList {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean iSEmpty() {
            return list.size() = 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static void pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
    }
}
