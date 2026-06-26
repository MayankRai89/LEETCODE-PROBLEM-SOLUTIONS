
public class Equivalent_StringArrays {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder letter1 = new StringBuilder();
        StringBuilder letter2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            letter1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            letter2.append(word2[i]);
        }
        return letter1.toString().equals(letter2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        boolean result = arrayStringsAreEqual(word1, word2);
        System.out.println(result);
    }

}
