class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i<image[0].length; i++){
            int len = image[i].length;
            int j = 0;
            int k = len-1;
            while(j<=k){
                if(image[i][j] == image[i][k]){
                    if(image[i][j] == 0){
                        image[i][j] = 1;
                        image[i][k] = 1;
                    }else{
                        image[i][j] = 0;
                        image[i][k] = 0;
                    }
                }
                j++;
                k--;
            }
        }
        return image;
    }
}