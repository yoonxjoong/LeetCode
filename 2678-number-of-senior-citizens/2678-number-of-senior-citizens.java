class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String detail : details){
            String age = detail.substring(11, 13);
            if(Integer.parseInt(age) > 60) count++;
        }
        return count;
    }
}