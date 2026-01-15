class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode last = head;
        ListNode current;

        while(list1 != null && list2 != null) {
            if(list1.val >= list2.val) {
                current = new ListNode(list2.val);
                last.next = current;
                last = last.next;

                System.out.println(list2.val);
                list2 = list2.next;
            }else{
                current = new ListNode(list1.val);
                last.next = current;
                last = last.next;

                System.out.println(list1.val);
                list1 = list1.next;
            }
        }

        if(list1 != null) {
            last.next = list1;
        }else{
            last.next = list2;
        }


        return head.next;
    }
}