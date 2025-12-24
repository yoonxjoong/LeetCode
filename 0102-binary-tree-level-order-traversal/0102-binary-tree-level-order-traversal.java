class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {

            int length = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i< length; i++) {
                TreeNode current = queue.poll();
                tmp.add(current.val);

                System.out.println(current.val);
                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(tmp);
        }

        return result;
    }
}