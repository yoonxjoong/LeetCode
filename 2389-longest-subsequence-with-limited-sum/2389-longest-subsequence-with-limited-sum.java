class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] prefixNums = new int[nums.length];

        prefixNums[0] = nums[0];

        // [0], [0,1], [0,1,2], [0,1,2,3]

        for (int i = 1; i < nums.length; i++) {
            prefixNums[i] = nums[i] + prefixNums[i - 1];
        }

        int[] ret = new int[queries.length];


        for (int i = 0; i <queries.length; i++) {
            ret[i] = binarySearch(prefixNums, queries[i]);
        }

        return ret;
    }

    int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        // [1,3,7,12], 10
        while (l < r) {
            int mid = (r + l) / 2;
            if (nums[mid] == target) {
                return mid + 1;
            }

            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return nums[l] > target ? l : l + 1;
    }
}