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
        ListNode normal = head;
        ListNode delay = head;
        int numMoves = 0; 
        
        while(normal != null && normal.next != null) {
            normal = normal.next;
            if(numMoves >= n) {
                delay = delay.next;
            }
            numMoves++;
        }
        if(numMoves - n < 0) {
            head = head.next;
            return head;
        }
        ListNode temp = delay.next.next;
        delay.next = temp;
        return head;
    }
}
