class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        num_count = Counter(nums)
        count = 0

        for num in num_count:
            if num - diff in num_count:
                if num - diff - diff in num_count:
                    print(num, num-diff, num-diff-diff)
                    count += 1

        return count