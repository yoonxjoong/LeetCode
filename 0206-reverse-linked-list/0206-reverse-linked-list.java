class Solution {
    public ListNode reverseList(ListNode head) {
        // The node value insert the queue.
        Stack<ListNode> stack = new Stack<>();

        ListNode ret = new ListNode();
        ListNode retCurr = ret;

        if(head == null) {
            return head;
        }

        ListNode curr = head;
        stack.add(curr);
        while(curr.next != null) {
            curr = curr.next;
            stack.add(curr);
        }

        while(!stack.isEmpty()) {
            ListNode tmp = stack.pop();
            tmp.next = null;
            ret.next = tmp;
            ret = ret.next;
        }


        return retCurr.next;

    }
}