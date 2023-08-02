class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        return [list(perm) for perm in list(itertools.permutations(nums))]