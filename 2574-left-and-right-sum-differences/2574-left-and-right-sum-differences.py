class Solution:
    def leftRigthDifference(self, nums: List[int]) -> List[int]:
        leftSum = []
        rightSum = []
        ans = []
        left = 0
        right = 0
        for i in range(len(nums)):
            leftSum.insert(i, left)
            rightSum.insert(-len(nums), right)
            left = left + nums[i]
            right = right + nums[len(nums) - i - 1]
        
        for i in range(len(nums)):
            ans.append(abs(leftSum[i] - rightSum[i]))
        
        return ans
        
        