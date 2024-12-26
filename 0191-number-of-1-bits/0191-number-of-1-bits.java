class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); // 마지막 비트 확인
            n >>>= 1;         // 논리적 오른쪽 이동 (부호 비트 없음)
        }
        return count;
    }
}