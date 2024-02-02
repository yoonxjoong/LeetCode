class Solution {
    public int pivotIndex(int[] nums) {
        int ret = -1;
        int[] tmp = new int[nums.length + 2];
        tmp[0] = 0;
        tmp[1] = nums[0];
        for(int i=1; i<nums.length; i++){
            tmp[i+1] = tmp[i] + nums[i];
        }

        for(int i=1; i<tmp.length -1; i++){
            if(tmp[i] == tmp[tmp.length - 2] - tmp[i-1]){
                ret = i-1;
                return ret;
            }
        }

        return ret;
    }
}