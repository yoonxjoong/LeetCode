class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        tmp = {}
        for i in range(len(indices)):
            tmp[indices[i]] = s[i]
        
        sort_dict = sorted(tmp.keys())
        ans = ""
        for key in sort_dict:
            ans += tmp[key]
        return ans