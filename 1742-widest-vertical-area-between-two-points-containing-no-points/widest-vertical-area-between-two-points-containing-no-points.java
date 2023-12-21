class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xPoints = new int[points.length];
        for(int i = 0; i<points.length; i++){
            xPoints[i] = points[i][0];
        }
        Arrays.sort(xPoints);
        int maxDiff = 0;
        for(int i = 0; i<xPoints.length-1; i++){
            int diff = xPoints[i+1] - xPoints[i];
            if(maxDiff<diff)    maxDiff=diff;
        }
        return maxDiff;
    }
}