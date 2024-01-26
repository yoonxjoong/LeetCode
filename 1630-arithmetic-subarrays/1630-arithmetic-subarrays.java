class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        for(int i = 0; i < l.length; i++){
            int[] tmp = new int[r[i] - l[i] + 1];
            int k = 0;
            boolean flag = true;
            for(int j = l[i]; j <= r[i]; j++){
                tmp[k] = nums[j];
                k++;
            }
            Arrays.sort(tmp);

            for(int j = 2; j < tmp.length; j++){
                if(tmp[j] - tmp[j-1] != tmp[1] - tmp[0]){
                    flag = false;
                    break;
                }
            }

            result.add(flag);
        }

        return result;
    }
}