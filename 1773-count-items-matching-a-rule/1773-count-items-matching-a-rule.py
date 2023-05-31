class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        ruleList = ['type', 'color', 'name']
        indexes = [i for i in range(len(ruleList)) if ruleList[i] == ruleKey]

        ans = 0
        for i in range(len(items)):
            if items[i][indexes[0]] == ruleValue:
               ans += 1
        return ans