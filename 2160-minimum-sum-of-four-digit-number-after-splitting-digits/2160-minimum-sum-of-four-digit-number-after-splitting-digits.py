class Solution:
    def minimumSum(self, num: int) -> int:
        tmp = sorted([int(d) for d in (str(num))])
        new1 = 10 * tmp[0] + tmp[2]
        new2 = 10 * tmp[1] + tmp[3]
        return new1 + new2
        