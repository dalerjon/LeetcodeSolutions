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
import java.lang.*;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode p1 = headA;
        int length1 = 1;
        ListNode p2 = headB;
        int length2 = 1;
        while(p1 != null && p1.next != null) {
            p1 = p1.next;
            length1++;
        }
        while(p2 != null && p2.next != null) {
            p2 = p2.next;
            length2++;
        }
        if(p1 != p2) {
            return null;
        }
        int difference = length1 - length2;
        p1 = headA;
        p2 = headB;
        if(difference > 0) {
            for(int i = 0; i < difference; i++) {
                p1 = p1.next;
            }
            while(p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
        else{
            int number = Math.abs(difference);
            for(int i = 0; i < number; i++){
                p2 = p2.next;
            }
            while(p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
    }
}
