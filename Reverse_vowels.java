import java.util.*;

public class Reverse_vowels {
    public String reverseVowels(String s) {
        char words[] = s.toCharArray();
        int i = 0,  j = s.length() - 1;
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u','A', 'E','I','O','U');
        while(i<j){
             while(i<j && !set.contains(words[i])){
            i++;
        }
        while(i<j && !set.contains(words[j])){
            j--;
        }
        char temp = words[i];
        words[i] = words[j];
        words[j] = temp;
        i++;
        j--;
        }
       return new String(words);
    }
}
