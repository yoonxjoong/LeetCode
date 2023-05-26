class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        tmp = []
        result = 0
        for i in range(0, n):
            tmp.append(start + 2 * i)
        
        for num in tmp:
            result ^= num

        return result