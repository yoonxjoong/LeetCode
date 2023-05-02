# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def __init__(self):
        self.ans = []
        self.tmp = 0

    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ans = dummy = ListNode(0)
        self.tmpNode(head)
        for val in self.ans:
            dummy.next = ListNode(val)
            dummy = dummy.next
        return ans.next

    def tmpNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        
        if head.val == 0:
            if self.tmp != 0:
                self.ans.append(self.tmp)
            self.tmp = 0
        else:
            self.tmp += head.val
        self.tmpNode(head.next)

            


       
        