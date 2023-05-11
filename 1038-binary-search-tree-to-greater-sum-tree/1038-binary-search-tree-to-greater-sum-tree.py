# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:
        tmpCnt = 0
        self.tmpBst(root, tmpCnt)
        return root
        
    
    def tmpBst(self, root: TreeNode, cnt: int) -> int:
        if not root:
            return cnt
        cnt = self.tmpBst(root.right, cnt)
        root.val += cnt
        cnt = root.val
        cnt = self.tmpBst(root.left, cnt)
        return cnt


    