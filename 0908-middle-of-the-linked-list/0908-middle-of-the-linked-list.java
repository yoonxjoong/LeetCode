class Solution {
    public ListNode middleNode(ListNode head) {
        int s = 1;
        ListNode a = head;
        while(head.next != null) {
            head = head.next;
            s++;
        }
        
        int l = 0;
        while(a.next != null) {
            a = a.next;
            l++;
            if(l >= s / 2) {
                return a;
            }
        }

        return a;
    }
}