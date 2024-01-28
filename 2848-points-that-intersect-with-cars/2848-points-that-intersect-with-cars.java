class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashMap<Integer, Boolean> tmp = new HashMap<>();

        for(List<Integer> num : nums){
            for(int i = num.get(0); i <= num.get(1); i++){
                tmp.put(i, true);
            }
        }

        return tmp.size();
    }
}