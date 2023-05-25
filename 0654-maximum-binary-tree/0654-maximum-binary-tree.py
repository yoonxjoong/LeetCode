# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
     def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
        node = TreeNode(max(nums))
        left, right = self.divide_array(nums, node)
        print(node)
        return node

     def divide_array(self, nums, node):
        # 배열의 합을 계산
        if not nums:
            return

        # 배열의 최대값을 구함
        max_val = max(nums)
        max_index = nums.index(max_val)

        left_array = []
        right_array = []

        # 배열을 순회하면서 합이 큰 쪽으로 순차적으로 요소를 추가
        for num in nums:
            if nums.index(num) < max_index:
                left_array.append(num)
            elif nums.index(num) > max_index:
                right_array.append(num)

        node2 = None
        node3 = None
        if not left_array:
            node2 = None
        else:
            node2 = TreeNode(max(left_array))

        if not right_array:
            node3 = None
        else:
            node3 = TreeNode(max(right_array))

        node.left = node2
        node.right = node3

        self.divide_array(left_array, node.left)
        self.divide_array(right_array, node.right)

        return left_array, right_array
        