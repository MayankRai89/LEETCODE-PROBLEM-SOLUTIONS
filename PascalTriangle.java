 import java.util.*;

public class PascalTriangle {
     public List<List<Integer>> generate(int numRows) {
       ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> res1 = new ArrayList<Integer>();
        res1.add(1);
        res.add(res1);
        for(int i = 1; i<numRows; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            int n = res.get(i-1).size();
            for(int j= 1; j< n; j++){
                temp.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}
