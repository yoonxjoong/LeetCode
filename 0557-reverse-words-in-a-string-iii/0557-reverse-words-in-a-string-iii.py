class Solution:
    def reverseWords(self, s: str) -> str:
        tmp_list = s.split()
        result = []
        for i in tmp_list:
            tmp_reverse = i[::-1]
            print(tmp_reverse)
            result.append(tmp_reverse)
        return ' '.join(result)