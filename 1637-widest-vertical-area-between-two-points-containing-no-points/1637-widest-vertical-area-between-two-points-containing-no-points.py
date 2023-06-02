class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        sorted_arr = sorted(points, key=lambda x: x[0])

        differences = [sorted_arr[i+1][0] - sorted_arr[i][0] for i in range(len(sorted_arr)-1)]
        
        return max(differences)