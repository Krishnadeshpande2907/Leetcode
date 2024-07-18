class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int jump = 0;
        int maxJump = 0;
        int currMaxJump = 0;
        for(int i = 0; i<len-1; i++){
            currMaxJump = Math.max(currMaxJump, i+nums[i]);
            if(currMaxJump >= len-1)  return jump+1;
            if(i >= maxJump){
                jump++;
                maxJump = currMaxJump;
            }
        }
        return jump;
    }
}