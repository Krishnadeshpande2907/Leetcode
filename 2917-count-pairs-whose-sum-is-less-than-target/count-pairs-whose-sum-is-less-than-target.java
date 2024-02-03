class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int size = nums.size();
        Integer[] numsArray = new Integer[size];
        numsArray = nums.toArray(numsArray);
        int count = 0;
        for(int i = 0; i<size-1; i++){
            int num1 = numsArray[i];
            for(int j = i+1; j<size; j++){
                if(num1 + numsArray[j] < target)  count++;
                else    j = size;
            }
        }
        return count;
    }
}