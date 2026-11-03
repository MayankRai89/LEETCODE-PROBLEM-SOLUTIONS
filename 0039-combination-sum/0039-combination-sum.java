class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(candidates, 0, target,new ArrayList<>(), ans);
        return ans;
    }
     void findCombination(int[] arr, int index, int target, List<Integer> ds, List<List<Integer>> ans) 
     {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        ds.add(arr[index]);

        findCombination(arr, index, target - arr[index], ds, ans);
        ds.remove(ds.size() - 1);

        findCombination(arr, index + 1, target, ds, ans);
     }
}