class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> s = new Stack<>();
        int max_price = 0;
        s.add(prices[0]);

        for (int i=1; i< prices.length; i++) {
            int tmp = s.peek();

            if (tmp > prices[i]) {
                s.pop();
                s.add(prices[i]);
            }

            if (s.peek() < prices[i]) {
                int tt = prices[i] - s.peek();
                max_price = Math.max(tt, max_price);
            }
        }

        return max_price;
    }
}