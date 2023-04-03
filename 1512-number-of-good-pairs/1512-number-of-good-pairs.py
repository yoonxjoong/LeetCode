class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        perm = list(combinations(nums, 2))
        ans = 0
        for i in range(len(perm)):
            if(perm[i][0] == perm[i][1]):
                ans = ans + 1
            
        return ans
    

 