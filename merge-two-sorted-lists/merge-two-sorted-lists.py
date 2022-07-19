# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        previousHead = ListNode(-1)
        
        previous = previousHead
        while list1 and list2:
            if list1.val <= list2.val:
                previous.next = list1
                list1 = list1.next
            else:
                previous.next = list2
                list2 = list2.next
            
            previous = previous.next
            
        previous.next = list1 if list1 is not None else list2
        
        return previousHead.next