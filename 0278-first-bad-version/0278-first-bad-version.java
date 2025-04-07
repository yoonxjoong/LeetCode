public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // 1, 2, 3, 4, 5
        // 1, 2, 3, 4, 5, 6
        int start = 1;
        int end = n;
        int mid = 0;

        while (start < end) {
            mid = start + ((end - start) >> 1);

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return start;
    }
}