class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        n = len(arr)
        ans = 0
        tmp = self.tmpFunction(3, arr)

        for i in range(1, n+1):
            if i % 2 != 0:
                ans += self.tmpFunction(i, arr)


        return ans

    def tmpFunction(self, num:int, arr:List[int]) -> int:
        tmp = 0
        for i in range(0, len(arr)):
            for j in range(i, num + i):
                tmp += arr[j]
                if j == len(arr) - 1:
                    return tmp

        return tmp




