class Solution:
    def finalString(self, s: str) -> str:
        tmp = []
        for i in s:
            if i == 'i':
                tmp.reverse()
            else:
                tmp.append(i)
        return ''.join(tmp)