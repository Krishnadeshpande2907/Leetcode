class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        if(haystackLen<needleLen)   return -1;
        if(needleLen == 0)  return 0;

        int diff = haystackLen - needleLen;
        for(int i = 0; i <= diff; i++){
            if(haystack.substring(i, (i + needleLen)).equals(needle)) return i;
        }
        return -1;
    }
}