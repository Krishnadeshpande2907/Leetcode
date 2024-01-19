class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map<Integer, Integer> table = new HashMap<>();
        // for(int i = 0; i<nums.length; i++){
        //     int complement = target - nums[i];
        //     if(table.containsKey(complement))   return new int[]{table.get(complement), i};
        //     table.put(nums[i], i);
        // }
        // return new int[]{};
        for(int i=1; i<nums.length; i++){
            for (int j=0 ; i+j<nums.length; j++){
                if(nums[i+j]+nums[j] == target){
                   return new int[] {i+j,j} ;
                }
            }
        }
        return new int[] {};
    }
}