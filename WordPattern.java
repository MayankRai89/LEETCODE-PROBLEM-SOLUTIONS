import java.util.HashMap;

public class WordPattern {
     public boolean wordPattern(String pattern, String s) {
        String[] tokens = s.split(" ");
        
        if(pattern.length() != tokens.length) 
            return false;

        HashMap<String, Character> map = new HashMap<>();
        HashMap<Character, String> reverseMap = new HashMap<>();

        for(int i=0;i<tokens.length;i++) {
            String find = tokens[i];
            char pt = pattern.charAt(i);
            
            if(!map.containsKey(find))
                map.put(find, pt);
            if(!reverseMap.containsKey(pt))
                reverseMap.put(pt, find);

            char mapPt = map.get(find);
            String mapStr = reverseMap.get(pt);
            
            if(mapPt != pt)
                return false;
            if(!mapStr.equals(find))
                return false;
        }
        return true;
    }
}
