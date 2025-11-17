class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return traverse(root, p, q);
    }

    private TreeNode traverse(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null || node == p || node == q) {
            return node;
        }

        TreeNode left = traverse(node.left, p, q);
        TreeNode right = traverse(node.right, p, q);

        if (left != null && right != null) {
            // 현재 root가 p와 q를 분리시키는 최초의 조상이므로, root가 LCA입니다.
            return node;
        }

        else if (left != null) {
            // 오른쪽은 null이고 왼쪽에서만 찾았으므로, 왼쪽에서 찾은 노드를 반환합니다.
            // (이 노드는 더 상위 레벨의 재귀 호출에서 LCA 후보가 됩니다.)
            return left;
        }

        // Case 3: 오른쪽에서만 찾았다면 (leftLCA == null && rightLCA != null)
        else {
            // 오른쪽에서 찾은 노드를 반환합니다.
            return right;
        }
    }
}