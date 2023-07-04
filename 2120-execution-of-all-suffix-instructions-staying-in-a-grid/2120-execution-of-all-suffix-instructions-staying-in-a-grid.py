class Solution:
    def executeInstructions(self, n: int, startPos: List[int], s: str) -> List[int]:
        ans = [0] * len(s)
        x,y = startPos[0], startPos[1]
        ans_tmp = []
        for j in range(len(ans)):
            count = 0
            tmp = s[j:]
            tmpPos = [x, y]
            for i in range(len(tmp)):
                if tmp[i] == 'R':
                    tmpPos[1] += 1
                elif tmp[i] == 'L':
                    tmpPos[1] -= 1
                elif tmp[i] == 'U':
                    tmpPos[0] -= 1
                elif tmp[i] == 'D':
                    tmpPos[0] += 1

                if tmpPos[0] < 0 or tmpPos[0] >= n or tmpPos[1] < 0 or tmpPos[1] >= n:
                    break;
                count += 1
            ans_tmp.append(count)

        return ans_tmp
