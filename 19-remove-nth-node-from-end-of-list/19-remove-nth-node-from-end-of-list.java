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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0, total = 0;
        ListNode p,walk,reach;
        p = walk = reach = head;
        
        while(p != null) {
            p = p.next;
            total++;
        }
        ListNode q = head.next;
        
        if (total == n) return q;
        total = (total - n) - 1;
        
        while(walk != null) {
            if (count == total) {
                reach = walk.next;
                walk.next = reach.next;
                return head;
            }else{
                count++;
                walk = walk.next;
            }
        }
        return head;
    }
}