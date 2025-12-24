class Solution {
  public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        int depth = 0;
        int tmp = 0;

        while(fast.next != null) {
            depth++;
            fast = fast.next;
        }

        while(slow.next != null && tmp < depth / 2) {
            tmp++;
            slow = slow.next;
        }

        if(depth % 2 != 0) {
            slow = slow.next;
        }

        return slow;
    }
}