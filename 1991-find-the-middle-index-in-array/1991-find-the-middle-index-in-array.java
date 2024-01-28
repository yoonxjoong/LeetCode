class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] tmp = new int[nums.length+2];



        int size = nums.length;
        int ret = -1;

        tmp[1] = nums[0];

        for (int i = 2; i <= size; i++) {
            // tmp[i] = tmp[i - 1] + nums[i];
            tmp[i] = tmp[i-1] + nums[i-1];
        }

        System.out.println(Arrays.toString(tmp));
        System.out.println("size : " + size);

        for (int i = 1; i <= size; i++) {

            if(tmp[size]-tmp[i-1] == tmp[i]){
                ret = i - 1;
                break;
            }
        }


        return ret;
    }
}