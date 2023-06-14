class Solution:
    def sortSentence(self, s: str) -> str:
        str_list = s.split(' ')
        words = {}
        for item in str_list:
            alphabet_part = ''.join(filter(str.isalpha, item))
            number_part = ''.join(filter(str.isdigit, item))
            words[number_part] = alphabet_part
        ans = ''
        for index, key in enumerate(sorted(words)):
            if index == len(words) - 1:
                ans += words[key]
            else:
                ans += words[key] + ' '
        return ans

































