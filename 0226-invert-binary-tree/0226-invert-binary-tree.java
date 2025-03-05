class Solution {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();

            if(currentNode == null) {
                continue;
            }

            TreeNode left = currentNode.left;
            TreeNode right = currentNode.right;

            currentNode.left = right;
            currentNode.right = left;

            stack.push(left);
            stack.push(right);

        }

        return root;
    }
}