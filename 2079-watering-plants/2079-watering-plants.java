class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ret = 0;
        int tmp = capacity;
        List<Integer> b = new ArrayList<Integer>();

        for(int i=0; i< plants.length; i++){
            int step = 0;
            if (tmp < plants[i]){
                System.out.println("refill");
                tmp = capacity;
                step += 2 * i;
            }

            tmp = tmp - plants[i];
            step++;
            b.add(step);
        }

        System.out.println(b.toString());

        return b.stream().mapToInt(Integer::intValue).sum();
    }
}