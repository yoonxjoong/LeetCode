class Solution {
    int perimeter = 0;
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] visit = new int[row][col];
        int ret = 0;

        for(int i=0; i < row; i++) {
            for (int j=0; j < col; j++) {
                if(grid[i][j] == 1 && visit[i][j] == 0){
                    dfs(grid, visit, i, j);
                }
            }
        }

        return perimeter;
    }

    void dfs(int[][] grid, int[][] visit, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
            perimeter++;
            return;
        }

        if(grid[r][c] == 0) {
            perimeter++;
            return;
        }

        if(visit[r][c] == 1) {
            return;
        }

        visit[r][c] = 1;

        dfs(grid, visit, r-1, c);
        dfs(grid, visit, r+1, c);
        dfs(grid, visit, r, c-1);
        dfs(grid, visit, r, c+1);

    }
}