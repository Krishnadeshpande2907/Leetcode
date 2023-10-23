class Solution {
    public boolean isPowerOfFour(int n) {
        double ans = Math.log(n)/Math.log(4);
        if(ans == (int) ans)    return true;
        else    return false;
    }
}