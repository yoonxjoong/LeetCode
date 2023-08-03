class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        tmp_1 = []
        tmp_2 = []

        for  i in nums:
            if i > 0:
                tmp_1.append(i)
            else:
                tmp_2.append(i)

        ans = []
        for i in range(0, len(tmp_1)):
            ans.append(tmp_1[i])
            ans.append(tmp_2[i])

        return ans
