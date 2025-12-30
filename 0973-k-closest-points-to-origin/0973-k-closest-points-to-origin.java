class Solution {

    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (p1, p2) -> {
            int dist1 = p1[0] * p1[0] + p1[1] * p1[1];
            int dist2 = p2[0] * p2[0] + p2[1] * p2[1];
            return dist1 - dist2; // 오름차순
        });

        // 2. 정렬된 것 중에서 앞에서부터 k개만 잘라서 반환
        return Arrays.copyOfRange(points, 0, k);
    }
}