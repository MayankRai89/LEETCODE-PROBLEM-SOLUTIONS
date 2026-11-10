class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int maxPossibleMove = 0;
        int currentEnd = 0;
        for( int i = 0; i<nums.length-1; i++){
            maxPossibleMove = Math.max(maxPossibleMove, i+nums[i]);
            if(i == currentEnd){
                jump ++;
                currentEnd = maxPossibleMove;
            }
        }
        return jump;

    }
}