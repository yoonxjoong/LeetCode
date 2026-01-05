class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 결과를 담을 리스트
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. 배열 정렬 (필수: 투 포인터 사용 및 중복 제거 용이)
        Arrays.sort(nums);
        
        // 2. 첫 번째 숫자(i)를 고정하고 반복
        for (int i = 0; i < nums.length - 2; i++) {
            
            // [중복 제거 1] i가 이전 숫자와 같다면 건너뜀 (이미 검사했으므로)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // 투 포인터 설정
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // 정답 발견!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // [중복 제거 2] left가 가리키는 값이 다음 값과 같다면 건너뜀
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // [중복 제거 3] right가 가리키는 값이 이전 값과 같다면 건너뜀
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // 다음 가능한 조합을 찾기 위해 포인터 이동
                    left++;
                    right--;
                    
                } else if (sum < 0) {
                    // 합이 0보다 작으면 더 큰 숫자가 필요함 -> left 이동
                    left++;
                } else {
                    // 합이 0보다 크면 더 작은 숫자가 필요함 -> right 이동
                    right--;
                }
            }
        }
        
        return result;
    }
}