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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;    
        }
        ListNode tortoise = head;
        ListNode hare = head.next;
        while(hare != null && hare.next != null) {
            if(hare == tortoise) {
                return true;
            }
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return false;           
    }
}
