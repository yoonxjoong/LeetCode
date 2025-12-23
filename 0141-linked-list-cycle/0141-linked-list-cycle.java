/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public HashMap<ListNode, Integer> map = new HashMap<>();

    public boolean hasCycle(ListNode head) {

        int pos = 0;

        int ret = search(head, pos);
        System.out.println("rest" + ret);

        return ret > -1;
    }

    public int search(ListNode head, int pos) {
        if(head == null) {
            return -1;
        }

        if(map.containsKey(head)) {
            System.out.println("duplication node : " + head.val + " , " + pos + " , " + map.get(head));
            return map.get(head);
        }

        System.out.println("current node : " + head.val + " , " + pos);
        map.put(head, pos);
        pos++;

        return search(head.next, pos);
    }


}