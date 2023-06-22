class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        count = 0
        num_count = Counter(nums)
        for i in num_count:
            count += num_count[i] * num_count[i+k]
    
        return count
