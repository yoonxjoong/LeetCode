class Solution {

    public boolean isBalanced(TreeNode root) {
        // 깊이/높이를 반환하는 헬퍼 함수를 호출합니다.
        // 균형 잡힌 트리는 0 이상의 높이를 반환하고,
        // 균형이 깨진 트리는 -1을 반환합니다.
        return checkHeight(root) != -1;
    }

    /**
     * 현재 노드의 높이를 반환하고, 균형이 깨지면 -1을 반환하는 헬퍼 함수
     */
    private int checkHeight(TreeNode node) {
        // 1. 베이스 케이스: 노드가 null이면 높이는 0입니다.
        if (node == null) {
            return 0;
        }

        // 2. 왼쪽 서브트리의 높이를 확인합니다.
        int leftHeight = checkHeight(node.left);
        // 왼쪽 서브트리가 이미 불균형하다면, 즉시 -1을 반환하여 전파합니다.
        if (leftHeight == -1) {
            return -1;
        }

        // 3. 오른쪽 서브트리의 높이를 확인합니다.
        int rightHeight = checkHeight(node.right);
        // 오른쪽 서브트리가 이미 불균형하다면, 즉시 -1을 반환하여 전파합니다.
        if (rightHeight == -1) {
            return -1;
        }

        // 4. 현재 노드의 균형을 확인합니다.
        int heightDiff = Math.abs(leftHeight - rightHeight);

        // 왼쪽 서브트리와 오른쪽 서브트리의 높이 차이가 1을 초과하면
        // 현재 노드에서 불균형이 발생했으므로 -1을 반환합니다.
        if (heightDiff > 1) {
            return -1;
        }

        // 5. 현재 노드가 균형 잡혀 있다면,
        // 현재 서브트리의 실제 높이를 반환합니다. (max(L, R) + 1)
        return Math.max(leftHeight, rightHeight) + 1;
    }
}