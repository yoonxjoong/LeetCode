/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode[]> stack = new Stack<>();
        // 두 트리의 루트 노드 쌍부터 비교 시작
        stack.push(new TreeNode[]{p, q});

        while (!stack.isEmpty()) {
            TreeNode[] current = stack.pop();
            TreeNode nodeP = current[0];
            TreeNode nodeQ = current[1];

            // 두 노드가 모두 null이면 구조적으로 동일하므로 패스
            if (nodeP == null && nodeQ == null) {
                continue;
            }
            // 하나만 null이거나, 값이 다르면 같은 트리가 아님
            if (nodeP == null || nodeQ == null || nodeP.val != nodeQ.val) {
                return false;
            }

            // 왼쪽 자식 쌍, 오른쪽 자식 쌍 비교를 위해 스택에 푸시
            stack.push(new TreeNode[]{nodeP.left, nodeQ.left});
            stack.push(new TreeNode[]{nodeP.right, nodeQ.right});
        }

        // 모든 노드를 비교했는데 문제 없었다면 true
        return true;
    }
}