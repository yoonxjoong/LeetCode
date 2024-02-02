class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
         List<Integer> result = new ArrayList<>();

        for (int startDigit = 1; startDigit <= 9; startDigit++) {
            int current = startDigit;
            int nextDigit = startDigit;

            while (current <= high && nextDigit < 10) {
                if (current >= low) {
                    result.add(current);
                }

                nextDigit++;
                current = current * 10 + nextDigit;
            }
        }
        Collections.sort(result);

        return result;
    }
}