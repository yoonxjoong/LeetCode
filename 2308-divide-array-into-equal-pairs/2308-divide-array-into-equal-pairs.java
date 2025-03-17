class Solution {

    public boolean divideArray(int[] nums) {
        int pair = nums.length / 2;

        HashMap<Integer, Integer> ht = new HashMap<>();

        // 숫자의 빈도를 저장
        for (int num : nums) {
            ht.put(num, ht.getOrDefault(num, 0) + 1);
        }

        // 모든 숫자의 빈도가 짝수인지 확인
        for (int count : ht.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}