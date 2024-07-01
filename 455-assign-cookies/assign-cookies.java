class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int greedPointer = 0;
        int cookiesPointer = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(greedPointer<g.length && cookiesPointer<s.length){
            if(g[greedPointer]<=s[cookiesPointer])   greedPointer++;
            cookiesPointer++;
        }
        return greedPointer;
    }
}