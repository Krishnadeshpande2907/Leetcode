class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int tail = 0;
        int validSubarraysStartingFromTail = 0;
        int res = 0;
        for(int head = 0; head<nums.length; head++){
            if(nums[head]%2==1) count++;
            while(count>k){
                if(nums[tail]%2==1) count--;
                tail++;
                validSubarraysStartingFromTail = 0;
            }
            if(count==k){
                int tempTail = tail;
                validSubarraysStartingFromTail = 1;
                while (tempTail < head && nums[tempTail] % 2 == 0) {
                    validSubarraysStartingFromTail++;
                    tempTail++;
                }
                res += validSubarraysStartingFromTail;
            }
        }
        return res;
    }
}