class Solution {
    public int pivotInteger(int n) {
        int[] tmp = new int[n];
        int[] tmp2 = new int[n];
        int ret = -1;
        tmp[0] = 1;
        tmp2[0] = 1;
        for(int i = 1; i < n; i++){
            tmp[i] = tmp[i-1] + i + 1;
            tmp2[i] = i + 1;
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                if(tmp[i] == tmp[n-1]){
                    ret = tmp2[i];
                }
            }else{
                if(tmp[i] == tmp[n-1] - tmp[i-1]){
                    ret = tmp2[i];
                }
            }
        }

        return ret;
    }
}

