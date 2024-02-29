class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ret = new int[image.length][image[0].length];

        for(int i=0; i<ret.length; i++){
            int[] tmp = reverse(image[i]);
            ret[i] = tmp;
        }

        return ret;
    }

    private int[] reverse(int [] a){
        int[] newArray = new int[a.length];

        for(int i=0; i<newArray.length; i++){
            newArray[newArray.length -1 -i] = a[i];
            if(newArray[newArray.length -1 -i] == 0){
                newArray[newArray.length -1 -i] = 1;
            }else{
                newArray[newArray.length -1 -i] = 0;
            }
        }

        return newArray;
    }
}