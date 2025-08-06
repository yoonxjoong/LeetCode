class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMaps = new HashMap<>();

        for (int num : nums) {
            numsMaps.put(num, numsMaps.getOrDefault(num, 0) + 1);
        }

        return Collections.max(numsMaps.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}