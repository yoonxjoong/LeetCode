class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int index = i;
            int value = nums[i];

            int subtraction = target - value;

            boolean exist = hm.containsKey(subtraction);

            if(exist) {
                return new int[] { i, hm.get(subtraction), };
            }

            hm.put(value, index);
        }

        return new int[] {};
    }
}