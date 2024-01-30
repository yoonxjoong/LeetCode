class Solution {
    public int minStartValue(int[] nums) {
        int[] tmp = new int[nums.length];
        int ret = 0;
        tmp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmp[i] = tmp[i - 1] + nums[i];
        }
        int j = 1;

        while (true) {
            int[] tmp2 = new int[nums.length];
            for (int i = 0; i < tmp.length; i++) {
                tmp2[i] = tmp[i] + j;
            }
            System.out.println(Arrays.toString(tmp2));
            int minValue = Arrays.stream(tmp2).min().orElseThrow();
            if (minValue > 0) {
                ret = j;
                break;
            }
            j++;
        }

        return ret;
    }
}