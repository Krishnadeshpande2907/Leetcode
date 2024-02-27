class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                result[pos] = nums[i];
                pos += 2;
            }else{
                result[neg] = nums[i];
                neg += 2;
            }
        }
        return result;
    }
}