class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0 ; i < result.length(); i++) {
            if(result.charAt(i) != result.charAt(result.length() -1 - i)){
                return false;
            }

        }

        return true;
    }
}