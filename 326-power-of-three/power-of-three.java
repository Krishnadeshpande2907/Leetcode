class Solution {
    public boolean isPowerOfThree(int n) {
        // double ans = Math.log(n)/Math.log(3);
        // if(ans == (int) ans)    return true;
        // else    return false;

        // return (Math.log10(n) / Math.log10(3)) % 1 == 0;
        return ( n>0 &&  1162261467%n==0);
    }
}