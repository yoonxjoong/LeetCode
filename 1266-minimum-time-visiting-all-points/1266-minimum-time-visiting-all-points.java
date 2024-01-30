class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ret = 0;
        for(int i=1; i<points.length; i++){
            int a = points[i][0] - points[i-1][0];
            int b = points[i][1] - points[i-1][1];
            ret += Math.max(Math.abs(a), Math.abs(b));
        }
        return ret;
    }
}