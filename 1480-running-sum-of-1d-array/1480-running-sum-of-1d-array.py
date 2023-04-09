class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        ans = []
        tmp = 0
        for i in range(len(nums)):
            tmp = tmp + nums[i]
            ans.append(tmp)
        return ans