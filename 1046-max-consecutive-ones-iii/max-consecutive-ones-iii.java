class Solution {
    public int longestOnes(int[] nums, int k) {
        int first = 0;
        int sec = 0;
        int numZero = 0;

        while(sec<nums.length){
            if(nums[sec] == 0)  numZero++;
            sec++;
            if(numZero>k){
                if(nums[first]==0)   numZero--;
                first++;
            }
        }
        return sec-first;
    }
}