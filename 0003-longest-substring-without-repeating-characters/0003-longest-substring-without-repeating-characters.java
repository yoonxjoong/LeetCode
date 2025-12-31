class Solution {

    public int lengthOfLongestSubstring(String s) {
        int fastIdx = 0;
        int maxLength = 0;
        String tmp = "";


        if(s.length() == 0) {
            return 0;
        }


        while(fastIdx < s.length()) {
            String charStr = String.valueOf(s.charAt(fastIdx));

            if(!tmp.contains(String.valueOf(s.charAt(fastIdx)))) {
                tmp = tmp + charStr;
                fastIdx++;

                if(tmp.length() > maxLength) {
                    maxLength = tmp.length();
                }
            }
            else{
                tmp = tmp.substring(tmp.indexOf(charStr) + 1);
            }
        }


        return maxLength;
    }
}