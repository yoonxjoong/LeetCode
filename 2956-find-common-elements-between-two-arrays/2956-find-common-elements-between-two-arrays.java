class Solution {
    private static boolean containsValue(int[] arr, int targetValue) {
        for (int element : arr) {
            if (element == targetValue) {
                return true; // 값이 발견되면 true 반환
            }
        }
        return false; // 값이 발견되지 않으면 false 반환
    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ret = new int[2];
        int a = 0;
        int b = 0;
        for(int num : nums1){
            if(containsValue(nums2, num)){
                a++;
            }
        }

        for(int num : nums2){
            if(containsValue(nums1, num)){
                b++;
            }
        }
        
        ret[0] = a;
        ret[1] = b;

        return ret;
    }
}