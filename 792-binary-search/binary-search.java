class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0]==target)    return 0;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int m = left + (right-left)/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target) right = m-1;
            else    left = m+1;
        }
        return -1;
    }
}