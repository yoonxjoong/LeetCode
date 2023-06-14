class Solution:
    def sumOfMultiples(self, n: int) -> int:
        tmp = []
        for i in range(1, n + 1):
            if i % 3 == 0:
               tmp.append(i)
            elif i % 5 == 0:
                tmp.append(i)
            elif i % 7 == 0:
                tmp.append(i)
                #
        return sum(tmp)
        