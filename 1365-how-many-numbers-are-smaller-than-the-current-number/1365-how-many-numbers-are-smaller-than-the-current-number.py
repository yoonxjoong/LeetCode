class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        ans = []
        for k in nums:
            count = sum(1 for i in nums if i < k)
            ans.append(count)
            
        return ans
        