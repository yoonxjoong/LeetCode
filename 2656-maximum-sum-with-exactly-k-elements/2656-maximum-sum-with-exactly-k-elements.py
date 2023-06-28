class Solution:
    def maximizeSum(self, nums: List[int], k: int) -> int:
        ans = 0
        for i in range(0, k):
            ans += i + max(nums)
        
        return ans
