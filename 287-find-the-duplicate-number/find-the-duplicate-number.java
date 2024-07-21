public class Solution {
    public int findDuplicate(int[] nums) {
        // int slow = nums[0];
        // int fast = nums[0];
        
        // do {
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        // } while (slow != fast);
        
        // slow = nums[0];
        // while (slow != fast) {
        //     slow = nums[slow];
        //     fast = nums[fast];
        // }
        // return slow;

        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }   
        return slow;

        // for(int i = 0; i<nums.length-1 ;i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j])  return nums[i];
        //     }
        // }
        // return -1;
    }
}