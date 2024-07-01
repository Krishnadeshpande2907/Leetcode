class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int greedSize = g.length;
        int allCookiesSize = s.length;
        int greedPointer = 0;
        int cookiesPointer = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(greedPointer<greedSize && cookiesPointer<allCookiesSize){
            if(g[greedPointer]<=s[cookiesPointer])   greedPointer++;
            cookiesPointer++;
        }
        return greedPointer;
    }
}