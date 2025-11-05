import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seenElements = new HashSet<>();
        for (int num : nums) {
            if (seenElements.contains(num)) {
                return true;
            }
            seenElements.add(num);
        }
        return false;
    }
}
