class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        combinations = list(itertools.combinations(nums, 3))
        count = 0
        for combination in combinations:
            if combination[2] - combination[1] == diff and combination[1] - combination[0] == diff:
                count += 1
        return count