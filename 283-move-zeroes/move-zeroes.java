class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1) return;
        
        int insert = 0;
        for(int num : nums){
            if(num != 0)   nums[insert++] = num;
        }

        while(insert<len)   nums[insert++] = 0;
    }
}