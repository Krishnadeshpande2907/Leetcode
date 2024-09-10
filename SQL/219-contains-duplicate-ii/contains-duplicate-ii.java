class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || k == 0 || nums.length < 2)   return false;
        HashSet<Integer> set = new HashSet<Integer>();
        int j = 0;
        for(int i : nums){
            if(!set.add(i)) return true;
            if(set.size()>=k+1)   set.remove(nums[j++]);
        }
        return false;
    }
}