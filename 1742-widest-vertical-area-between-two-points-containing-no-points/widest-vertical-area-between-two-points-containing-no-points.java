class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xPoints = new int[points.length];
        for(int i = 0; i<points.length; i++)    xPoints[i] = points[i][0];
        Arrays.sort(xPoints);
        int maxDiff = 0;
        for(int i = 1; i<xPoints.length; i++) maxDiff = Math.max(maxDiff, (xPoints[i] - xPoints[i-1]));
        return maxDiff;
    }
}