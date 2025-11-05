import java.util.HashMap;
import java.util.Map;

public class COntinDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int idx = 0;
      Map<Integer, Integer>map =new HashMap<>();
      for(int num: nums){
        if( map.containsKey(num)){
            int prev = map.get(num);
            if(idx - prev<= k){
                return true;
            }
        }
        map.put(num, idx);
        idx++;
      }
      return false;
    }
}
