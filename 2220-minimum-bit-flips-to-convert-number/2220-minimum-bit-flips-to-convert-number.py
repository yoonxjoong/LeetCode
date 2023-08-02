class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        start_bin = bin(start)[2:]  # '0b' 접두사 제거 후 2진수로 변환
        goal_bin = bin(goal)[2:]    # '0b' 접두사 제거 후 2진수로 변환

        max_len = max(len(start_bin), len(goal_bin))
        start_bin = start_bin.zfill(max_len)  # 더 짧은 이진수를 앞에 0으로 채워 길이를 맞춤
        goal_bin = goal_bin.zfill(max_len)    # 더 짧은 이진수를 앞에 0으로 채워 길이를 맞춤

        flip_count = sum(bit1 != bit2 for bit1, bit2 in zip(start_bin, goal_bin))
        return flip_count