class Solution:
    def sortTheStudents(self, score: List[List[int]], k: int) -> List[List[int]]:
        tmp = {}
        ans = []
        for i in range(len(score)):
            tmp[score[i][k]] = score[i]
        print(tmp)
        sorted_keys = sorted(tmp.keys(), reverse=True)

        for i in range(len(sorted_keys)):
            ans.append(tmp[sorted_keys[i]])
        
        return ans

            