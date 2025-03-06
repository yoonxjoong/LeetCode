class Solution {

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
            return;
        }

        if (grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        dfs(grid, r-1, c); // 위로 이동
        dfs(grid, r+1, c); // 아래로 이동
        dfs(grid, r, c-1); // 왼쪽으로 이동
        dfs(grid, r, c+1); // 오른쪽으로 이동
    }
}