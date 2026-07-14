
public class subset {
    public static void findSubset(String st, String ans, int i) {
        if (i == st.length()) {
            System.out.println(ans);
            return;
        }
        findSubset(st, ans + st.charAt(i), i + 1);
        findSubset(st, ans, i + 1);
    }

    public static void main(String[] args) {
        String st = "abc";
        findSubset(st, "", 0);
    }
}
