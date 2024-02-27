class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // 시작 지점과 빈 공간의 개수를 초기화
        int emptyCount = 0;
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                } else if (grid[i][j] == 0) {
                    emptyCount++;
                }
            }
        }

        return dfs(grid, startRow, startCol, emptyCount + 1);
    }

    private int dfs(int[][] grid, int row, int col, int emptyCount) {
        int m = grid.length;
        int n = grid[0].length;

        // 범위를 벗어나거나 장애물이거나 이미 방문한 곳이면 0을 반환
        if (row < 0 || row >= m || col < 0 || col >= n || grid[row][col] == -1 || grid[row][col] == 3) {
            return 0;
        }

        // 종료 지점에 도달하면 모든 빈 공간을 방문했는지 확인
        if (grid[row][col] == 2) {
            return emptyCount == 0 ? 1 : 0;
        }

        // 현재 지점을 방문했다고 표시
        grid[row][col] = 3;

        // 4방향으로 DFS 탐색
        int paths = dfs(grid, row + 1, col, emptyCount - 1)
                + dfs(grid, row - 1, col, emptyCount - 1)
                + dfs(grid, row, col + 1, emptyCount - 1)
                + dfs(grid, row, col - 1, emptyCount - 1);

        // 방문한 지점을 되돌려놓음
        grid[row][col] = 0;

        return paths;
    }
}