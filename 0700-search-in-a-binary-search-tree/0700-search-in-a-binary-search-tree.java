class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return test(root, val);
    }

    public TreeNode test(TreeNode root, int val){
        if(root == null || root.val == val){
            return root;
        }

        if (val < root.val) {
            return test(root.left, val);
        } else {
            return test(root.right, val);
        }

    }
}