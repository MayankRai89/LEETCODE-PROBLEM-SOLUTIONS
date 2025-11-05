import java.util.HashSet;
import java.util.Set;

public class INtesection_Two_Array {
     public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int num : nums1){
            s.add(num);
        }
    
        for(int num:nums2){
            if(s.contains(num)){
                s2.add(num);
            }
        }
        int arr[]= new int[s2.size()];
        int i = 0;
        for( int num:s2){
            arr[i++] = num;
        }
        return arr;
    }
}
