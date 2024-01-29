class Solution {
    public int maxSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] prefix = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            int sum = 0;
            for(int j=1; j<=n; j++){
                sum += grid[i-1][j-1];
                prefix[i][j] = prefix[i-1][j]+sum;
            }
        }

        for(int i=0; i<prefix.length; i++){
            System.out.println(Arrays.toString(prefix[i]));
        }

        int ans = 0;
        for(int i=1; i+2<=m; i++){
            for(int j=1; j+2<=n; j++){
                int curr = prefix[i+2][j+2]-prefix[i-1][j+2]-prefix[i+2][j-1]+prefix[i-1][j-1];
                curr -= grid[i][j-1]+grid[i][j+1];
                ans = Math.max(curr, ans);
            }
        }
        return ans;
    }
}