class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length==1)    return true;
        int canReach = 0;
        for(int i = 0; i<nums.length; i++){
            canReach = Math.max(canReach, i+nums[i]);
            if(canReach>=nums.length-1)    return true;
            if(i == canReach && nums[canReach]==0)   return false;
        }
        return true;
    }
}