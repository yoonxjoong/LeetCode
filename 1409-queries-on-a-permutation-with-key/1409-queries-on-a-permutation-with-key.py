class Solution:
    def processQueries(self, queries: List[int], m: int) -> List[int]:
        tmp = list(range(1, m+1))
        ans = []
        for value in queries:
            index = tmp.index(value)
            element = tmp.pop(index)
            tmp.insert(0, element)
            ans.append(index)

        return ans


