class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0;
        for(int r=0; r< row; r++) {
            for (int c = 0; c < col; c++) {
                if(grid[r][c] == 1) {
                    int tmpArea = dfs(grid, r, c);
                    maxArea = Math.max(maxArea, tmpArea);
                }
            }
        }

        return maxArea;
    }

    int dfs(int[][] grid, int r, int c) {
        if(r < 0 || c < 0 || r >= grid.length | c >= grid[0].length ) {
            return 0 ;
        }

        if(grid[r][c] != 1) {
            return 0;
        }

        grid[r][c] = 0;

        int area = 1;
        area += dfs(grid, r-1, c);
        area += dfs(grid, r+1, c);
        area += dfs(grid, r, c-1);
        area += dfs(grid, r, c+1);

        return area;
    }
}