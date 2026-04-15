class Solution {
    public String addBinary(String a, String b) {
        String ret = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            System.out.println(sum);

            carry = sum / 2;
            ret += sum % 2;

            j--;
            i--;

        }
        
        return this.reverse(ret);
    }

    private String reverse(String a) {
        String ret = "";

        for(int i = a.length() -1; i >= 0; i--) {
            ret += a.charAt(i);
        }

        return ret;
    }

}