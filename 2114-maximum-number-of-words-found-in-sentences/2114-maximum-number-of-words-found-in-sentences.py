import re
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        tmp = []
        for i in range(len(sentences)):
            indices = [i.start() for i in re.finditer(" ", sentences[i])]
            tmp.append(len(indices))
        ans = max(tmp)
        ans = ans + 1
        
        return ans
        