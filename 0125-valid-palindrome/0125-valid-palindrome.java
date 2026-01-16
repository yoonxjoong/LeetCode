class Solution {
    public boolean isPalindrome(String s) {
        int fIndex = s.length() - 1;
        int bIndex = 0;

        while(fIndex > bIndex) {
            char fValue = s.charAt(fIndex);
            char bValue = s.charAt(bIndex);


            if(fValue == ' ' ) {
                fIndex--;
                continue;
            }

            if(!Character.isDigit(fValue) && !Character.isAlphabetic(fValue) ) {
                fIndex--;
                continue;
            }

            if(bValue == ' ') {
                bIndex++;
                continue;
            }

            if(!Character.isDigit(bValue) && !Character.isAlphabetic(bValue) ) {
                bIndex++;
                continue;
            }


            System.out.println("fValue : " + fValue + ", bValue : " + bValue );

            if(Character.toLowerCase(fValue) != Character.toLowerCase(bValue)) {
                return false;
            }

            fIndex--;
            bIndex++;

        }

        return true;
    }
}