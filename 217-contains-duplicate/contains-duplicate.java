class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<Integer>();
        for(int i : nums)   if(!duplicate.add(i)) return true;
        return false;
    }
}