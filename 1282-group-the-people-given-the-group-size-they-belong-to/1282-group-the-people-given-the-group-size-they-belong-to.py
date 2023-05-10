class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        ans = []
        for i in range(0, max(groupSizes)):
            indexs = self.find_indexes(groupSizes, i+1)

            if len(indexs) == 0:
                continue

            if len(indexs)> i+1:
                    for j in range(0, len(indexs),i+1):
                        ans.append(indexs[j:j+i+1])
            else:
                ans.append(indexs)
            
        return ans

    def find_indexes(self, arr, value):
        return [i for i, x in enumerate(arr) if x == value]