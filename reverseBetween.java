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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        for (int i = 0; i < m-1; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        ListNode after = curr.next;
        
        for (int j = 0; j < n-m; j++) {
            curr.next = after.next;
            after.next = prev.next;
            prev.next = after;
            after = curr.next;
        }
        return dummy.next;
    }
}