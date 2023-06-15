class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        unique_values = set()
        duplicates = []
        ans = 0
        for edge in edges:
            for value in edge:
                if value in unique_values:
                    ans = value
                    break
                else:
                    unique_values.add(value)
     
        return ans
