/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        ListNode listNodeToReturn = null;
        while(headA != null){
            hashSet.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(hashSet.contains(headB)){
                listNodeToReturn = headB;
                break;
            }
                headB = headB.next;
            
        }
        return listNodeToReturn;
    }
}