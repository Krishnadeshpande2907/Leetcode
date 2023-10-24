class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int maxIndex = 0;
        for(int i = 0; i<mat.length; i++){
            int numOnes = 0;
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j]==1)    numOnes++;
            }
            if(numOnes > maxOnes){
                maxOnes = numOnes;
                maxIndex = i;
            }
        }
        return new int[]{maxIndex, maxOnes};
    }
}