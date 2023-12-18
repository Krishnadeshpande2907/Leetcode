class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int end = nums.length;
        return ((nums[end-1]*nums[end-2]) - (nums[0]*nums[1]));
    }
}