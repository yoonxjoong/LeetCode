
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[] up = {0, 1};
        int[] down = {0, -1};
        int[] right = {1, 0};
        int[] left = {-1, 0};
        int[][] dr = {up, down, right, left};

        int rows = mat.length;
        int cols = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                }
                else {
                    mat[i][j] = -1;
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for(int[] d : dr ) {
                int nr = r + d[0];
                int nc = c + d[1];

                // 지도 바운더리 체크 && 방문하지 않은 칸
                if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && mat[nr][nc] == -1) {
                    mat[nr][nc] = mat[r][c] + 1;
                    queue.add(new int[]{nr, nc});
                }
            }


        }

        return mat;
    }
}