class Solution:
       def largestAltitude(self, gain: List[int]) -> int:
            highest = 0
            now = 0
            for i in gain:
                now += i
                if highest < now:
                    highest = now
            return highest