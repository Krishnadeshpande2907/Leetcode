class Solution {
    private void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int red = 0;
        int blue = nums.length-1;
        for(int i = 0; i<=blue; i++){
            if(nums[i]==0)  swap(i, red++, nums);
            else if(nums[i]==2) swap(i--, blue--, nums);
        }
    }
}