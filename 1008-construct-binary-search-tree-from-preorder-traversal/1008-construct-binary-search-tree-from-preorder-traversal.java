class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        //the idea should be create root, then insert node one by one
        if (preorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            insertNode(root, preorder[i]);
        }
        return root;
    }

    private void insertNode(TreeNode node, int val) {
        if (val < node.val) {
            if (node.left != null) {
                insertNode(node.left, val);
            } else {
                node.left = new TreeNode(val);
                return;
            }
        } else {
            if (node.right != null) {
                insertNode(node.right, val);
            } else {
                node.right = new TreeNode(val);
                return;
            }
        }
    }
}
