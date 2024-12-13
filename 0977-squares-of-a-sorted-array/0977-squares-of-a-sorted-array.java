class Solution {
    public int[] sortedSquares(int[] nums) {
        // 투포인트 왼쪽 포인터, 오른쪽 포인터(배열 맨 끝부터) 변수 초기화
        int left = 0;
        int right = nums.length - 1;
        int[] ret = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // 왼쪽 포인터 값이 오른쪽 포인터 값보다 크면 마지막 배열 인덱스에 저장
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ret[nums.length - i -1] = nums[left] * nums[left];
                left++;
            }else {
                ret[nums.length - i - 1] = nums[right] * nums[right];
                right--;
            }
        }

        return ret;

    }
}