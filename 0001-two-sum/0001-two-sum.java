class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }
            hashMap.put(nums[i], i);  // Store the current number and its index in the HashMap.
        }

        throw new IllegalArgumentException("No two sum solution");

    }
}