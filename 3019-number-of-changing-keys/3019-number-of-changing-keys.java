class Solution {
    public int countKeyChanges(String s) {
        int ret = 0;
        for (int i = 1; i < s.length(); i++) {
            char a = Character.toUpperCase(s.charAt(i - 1));
            char b = Character.toUpperCase(s.charAt(i));

            if (Character.compare(a, b) != 0) {
                ret++;
            }
        }

        return ret;
    }
}