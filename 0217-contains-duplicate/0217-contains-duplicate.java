class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ret = false;

        Set<Integer> s = new HashSet<>();

        for(int num : nums) {

            if(s.contains(num)) {
                return true;
            }
            s.add(num);
        }

        return ret;
    }
}