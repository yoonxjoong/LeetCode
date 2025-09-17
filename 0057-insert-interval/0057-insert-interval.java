class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
                    i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);

            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        // 합쳐진 최종 간격을 결과에 추가
        result.add(newInterval);

        // 3. 새로운 간격 뒤에 있는, 겹치지 않는 간격들 추가
        //    (남은 간격들)
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}