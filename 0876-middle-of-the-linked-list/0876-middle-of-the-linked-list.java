class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        int size = 0;

        while(fast.next != null) {
            fast = fast.next;
            size++;
        }
        System.out.println(size);
        int size2 = 0;

        while(slow.next != null) {
            if(size % 2 != 0) {
                if(size / 2 + 1 <= size2) {
                    return slow;
                }
            } else{
                if(size / 2 <= size2) {
                    return slow;
                }
            }


            slow = slow.next;
            size2++;
        }


        return slow;
    }
}