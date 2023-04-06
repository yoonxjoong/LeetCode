class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        num = 0
        for char in jewels:
            num = num + stones.count(char)
        return num
      
        