class Solution {
    public List<List<Integer>> tmp = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root);
        return tmp;
    }

    public void bfs(TreeNode root) {
        if(root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> tmp2 = new ArrayList<>();

            for(int i=0; i<length; i++) {
                TreeNode current = queue.poll();

                tmp2.add(current.val);

                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }

            tmp.add(tmp2);
        }

    }
}