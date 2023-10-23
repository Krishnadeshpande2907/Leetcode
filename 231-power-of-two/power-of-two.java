class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==0)    return false;
        // if(n==1)    return true;
        // if(n%2!=0)  return false;
        // return isPowerOfTwo(n/2);

        // Takes a lot of memory

        return n>0 && Integer.bitCount(n) == 1;
    }
}