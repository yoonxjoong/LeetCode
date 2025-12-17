
// - 비용 배열 -> Integer 배열
// - 배열[i] = i번째 계단의 비용
// - 비용 지불 = 계단 +1 or 계단 +2

// 요구사항 : 꼭대기에 도달하는 최소 비용은 얼마?

/**
 
 [10, 15, 20]
 
 계단의 높이 = 2 + 1 = 3
 
 0번째 계단의 비용 = 10
 1번째 계단의 비용 = 15
 2번째 계단의 비용 = 20

 if 0번째 계단 선택:
    if 1번째 계단 선택:
        if 2번쨰 계단 선택:
            비용 10 + 15 + 20 = 35;
            return
        비용 10 + 15;
        return
    if 2번째 계단 선택:
        비용 10 + 20 = 30;
        return

 if 1번째 계단 선택:
    if 2번째 계단 선택:
        비용 15 + 20 = 35;
        return
    비용 15;
    return
0번째 계단에 오르려면 cost[0]
1번쨰 계단에 오르려면 cont[1]

2번째 계단에 최소 비용은 cost[2] = cost[2] min(cost[0], cost[1]) => 10
3번째 계단에 최소 비용은 cost[3] = min(cost[1], cost[2]) => 15;

 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] heap = new int[cost.length];

        heap[0] = cost[0];
        heap[1] = cost[1];

        for(int i = 2; i < cost.length; i++ ) {
            heap[i] = cost[i] + Math.min(heap[i-1], heap[i-2]);
        }

        return Math.min(heap[cost.length - 1], heap[cost.length - 2]);
    }
}