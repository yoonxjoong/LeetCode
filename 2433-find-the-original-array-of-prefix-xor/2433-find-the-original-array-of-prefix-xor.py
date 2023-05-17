class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        ans = [0 for i in range(len(pref))]
        ans[0] = pref[0]
        for i in range(1, len(pref)):
            ans[i] = pref[i-1]^pref[i]
        return ans
      
        # print('###################')
        # print(0 ^ 5)
        # print(5 ^ 2)
        # print(5 ^ 7 ^ 0)
        # print(5 ^ 7 ^ 2 ^ 3)
        # print(5 ^ 7 ^ 2 ^ 3 ^ 1)