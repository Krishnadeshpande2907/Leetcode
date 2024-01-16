class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<Integer>();
        for(int i : nums){
            if(duplicate.contains(i)) return true;
            else    duplicate.add(i);
        }
        return false;
    }
}