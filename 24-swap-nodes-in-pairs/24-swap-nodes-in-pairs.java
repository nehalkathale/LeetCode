/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode listNode = temp;
        while(null != temp.next && null != temp.next.next){
            ListNode start = temp.next;
            ListNode end = start.next;
            start.next = end.next;
            end.next = start;
            temp.next = end;
            temp = start;
        }
        return listNode.next;
    }
}