class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> days = new Stack<Integer>();
        for(int i = 0; i<temp.length; i++){
            while(!days.isEmpty() && temp[days.peek()]<temp[i]){
                ans[days.peek()] = i-days.pop();
            }
            days.push(i);
        }
        return ans;
    }
}