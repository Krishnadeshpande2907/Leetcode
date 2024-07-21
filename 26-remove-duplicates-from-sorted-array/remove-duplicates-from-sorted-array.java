class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        int end = nums.length-1;
        for(int i = 0; i <= end; i++){
            if(unique.contains(nums[i]))    swap(i--, end--, nums);
            else    unique.add(nums[i]);
        }
        Arrays.sort(nums);
        return unique.size();
    }
    private void swap(int a, int b, int[] arr){
        arr[a] = arr[b];
        arr[b] = Integer.MAX_VALUE;
    }
}