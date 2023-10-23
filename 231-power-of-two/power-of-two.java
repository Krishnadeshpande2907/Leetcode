class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==0)    return false;
        // if(n==1)    return true;
        // if(n%2!=0)  return false;
        // return isPowerOfTwo(n/2);

        // Takes a lot of memory

        int a = 0;
        while(true){
            if(Math.pow(2,a) == n)  return true;
            else if(Math.pow(2,a)< n)   a++;
            else    return false;
        }
    }
}