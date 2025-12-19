// 요구사항, 바이너리 트리 오른쪽에 서있다고 가정을 해보자,
// 위에서 부터 아래로 보이는 노드의 리스트를 리턴해보자

// 제일 오른쪽에 있는 노드를 출력하기


class Solution {
    public List<Integer> tmp = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        bfs(root);
        return tmp;
    }

    public void bfs(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int length = queue.size();
            int rightValue = 0;
            for(int i= 0; i < length; i++) {
                TreeNode current = queue.poll();

                rightValue = current.val;
                if(i == length - 1) {
                    tmp.add(rightValue);
                }
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
        }
    }
}