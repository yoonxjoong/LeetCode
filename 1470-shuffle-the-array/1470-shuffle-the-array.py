class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        xArray = nums[0:n]
        yArray = nums[n:len(nums)]
        
        ans = []
        for i in range(n):
            ans.append(xArray[i])
            ans.append(yArray[i])
        
        return ans
            