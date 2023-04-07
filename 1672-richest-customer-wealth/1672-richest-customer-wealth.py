class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ans = 0
        for i in range(len(accounts)):
            tmp = 0
            for j in range(len(accounts[i])):
                tmp = tmp + accounts[i][j]
            if ans < tmp:
                ans = tmp
        return ans
        