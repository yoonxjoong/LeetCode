class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] tmp = new int[nums.length];
        int[] ret = new int[nums.length];
        tmp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmp[i] = tmp[i - 1] ^ nums[i];
        }
        int idx = 0;
        for (int i = tmp.length - 1; i >= 0; i--) {
            int maxK = (1 << maximumBit) - 1;
            ret[idx] = maxK ^ tmp[i];
            idx++;
        }


        return ret;
    }
}