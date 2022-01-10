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
    public ListNode middleNode(ListNode head) {
        int count = 2;
        ListNode listNode = head.next;
        if(listNode == null)
            return head;
        while(listNode.next != null){
            listNode = listNode.next;
            count++;
        }
        int mid = count/2 + 1;
        int i =1;
        while(head.next != null && i<mid){
            head = head.next;
            i++;
        }
        return head;
    }
}