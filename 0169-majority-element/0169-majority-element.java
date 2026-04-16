class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> maps= new HashMap<>();
        int topKey = 0;
        int maxValue = Integer.MIN_VALUE;

        for(int num : nums) {
            if(maps.containsKey(num)) {
                maps.put(num, maps.get(num) + 1);
            }else{
                maps.put(num, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                topKey = entry.getKey();
            }
        }


        return topKey;
    }
}