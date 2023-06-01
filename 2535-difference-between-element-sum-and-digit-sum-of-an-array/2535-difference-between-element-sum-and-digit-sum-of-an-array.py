class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        digits = []
        for num in nums:
            digits.extend([int(digit) for digit in str(num)])

        return abs(sum(nums) - sum(digits))