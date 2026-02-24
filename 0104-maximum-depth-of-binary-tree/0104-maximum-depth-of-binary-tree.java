
class Solution {
    public int count = 0;
    public int maxDepth(TreeNode root) {
        this.dfs(root);

        return count;
    }

    void dfs(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()) {
            int level = q.size();
            for(int i = 0; i < level; i++) {
                TreeNode treeNode = q.poll();

                if(treeNode == null) {
                    return;
                }

                if(treeNode.left != null) {
                    q.add(treeNode.left);
                }

                if(treeNode.right != null) {
                    q.add(treeNode.right);
                }
            }

            count++;
        }

    }
}