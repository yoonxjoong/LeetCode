class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originColor = image[sr][sc];

        if(originColor == color) return image;

        dfs(image, sr, sc, color, originColor);

        return image;
    }

    void dfs(int[][] image, int sr, int sc, int color, int originColor) {
        if (sr < 0 || sc < 0 || image.length <= sr || image[0].length <= sc) {
            return;
        }

        if(image[sr][sc] != originColor) {
            return;
        }

        image[sr][sc] = color;

        dfs(image, sr - 1, sc, color, originColor);
        dfs(image, sr + 1, sc, color, originColor);
        dfs(image, sr, sc - 1, color, originColor);
        dfs(image, sr, sc + 1, color, originColor);
    }
}