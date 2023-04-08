class Solution:
    def isStrictlyPalindromic(self, n: int) -> bool:
        def numberToBase(n, b):
            digits = []
            while n:
                digits.append(n % b)
                n //= b
            return digits
           
        for i in range(2, n-2 +1):
            if numberToBase(n, i) != numberToBase(n, i)[::-1]:
                return False
        return True