# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumEvenGrandparent(self, root: TreeNode) -> int:    
        return self.tempNode(root, None, None)

    def tempNode(self, root, parent, grandParent) -> int:
        if root is None:
            return 0

        sum_val = 0
        if grandParent and grandParent.val % 2 == 0:
            sum_val = root.val
        
        # print(root.val, parent, grandParent)
        sum_val += self.tempNode(root.left, root, parent)
        sum_val += self.tempNode(root.right, root, parent)

        return sum_val


        return 0



 