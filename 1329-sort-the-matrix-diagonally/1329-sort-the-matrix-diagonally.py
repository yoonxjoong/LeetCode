class Solution:
    def diagonalSort(self, mat: List[List[int]]) -> List[List[int]]:
        m, n = len(mat), len(mat[0])
        # 대각선 그룹화
        diagonals = {}
        for i in range(m):
            for j in range(n):
                diff = j - i
                if diff not in diagonals:
                    diagonals[diff] = []
                diagonals[diff].append(mat[i][j])
        print(diagonals)

        # 대각선 정렬
        for diagonal in diagonals.values():
            diagonal.sort()

        print(diagonals)

        for i in range(m):
            for j in range(n):
                diff = j - i
                mat[i][j] = diagonals[diff].pop(0)

        print(mat)
        return mat
