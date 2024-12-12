class Solution {

    public int[] twoSum(int[] numbers, int target) {
        // 1. 왼쪽/ 오른쪽 포인터 변수를 초기화 (정렬된 배열이기 때문에 양쪽 끝에서 시작)
        int left = 0;
        int right = numbers.length - 1;

        // 2. 결과 배열 변수 초기화
        int[] result = new int[2];

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            // sum이 target 보다 작은 경우 왼쪽 포인터 1 증가
            if (sum < target) {
                left++;
            }
            // sum이 target 보다 큰 경우 오른쪽 포인터 1 감소
            else if (sum > target) {
                right--;
            } else {
                // sum이 target과 같은 경우 결과 리턴
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            }
        }

        return result;
    }
}