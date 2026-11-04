import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0,
                  new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(int[] arr, int target, int index,
                   List<Integer> ds,
                   List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            ds.add(arr[i]);

            backtrack(arr, target - arr[i], i + 1, ds, ans);

            ds.remove(ds.size() - 1);
        }
    }
}