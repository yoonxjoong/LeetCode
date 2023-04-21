# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        max_depth = 0
        depth_sum = 0
        def dfs(node: Optional[TreeNode], cur_depth: int) -> None:
            nonlocal max_depth, depth_sum
            if not node:
                return
                
            if max_depth < cur_depth:
                max_depth = cur_depth
                depth_sum = node.val
        
            elif max_depth == cur_depth:
                  depth_sum += node.val
            
            dfs(node.left, cur_depth+1)
            dfs(node.right, cur_depth+1)
        
        dfs(root, 0)
        
        return depth_sum
        