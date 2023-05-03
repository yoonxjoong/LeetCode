# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.arr = []

    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        self.tmpBST(root, low, high)
        return sum(self.arr)

    def tmpBST(self, tmp: Optional[TreeNode], low: int, high: int) -> int:
        if not tmp:
            return 0
        if tmp.val >= low and tmp.val <= high:
            self.arr.append(tmp.val)

        self.tmpBST(tmp.left, low, high)
        self.tmpBST(tmp.right, low, high)

        return 0

   