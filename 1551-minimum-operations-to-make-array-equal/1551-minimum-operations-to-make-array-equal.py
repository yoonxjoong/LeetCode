class Solution:
    def minOperations(self, n: int) -> int:
        arr = [(2*i) + 1 for i in range(n)]

        arr_avg = sum(arr) / n

        arr_less_than_avg = [arr_avg - x for x in arr if x < arr_avg]

        return int(sum(arr_less_than_avg))