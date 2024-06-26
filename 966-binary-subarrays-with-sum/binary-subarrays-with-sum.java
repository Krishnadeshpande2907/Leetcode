class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }

    public int atMost(int[] nums, int goal){ 
        int tail = 0;
        int sum = 0;
        int result = 0;
        for(int head =0; head<nums.length; head++){
            sum+=nums[head];
            while(sum>goal && tail<=head){
                sum-=nums[tail];
                tail++;
            }
            result+=head-tail+1;
        }
        return result;
    }
}