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
import java.util.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode empty = new ListNode(0);
        ListNode current = result;
        int carry = 0;
        while(l1 != empty || l2 != empty) {
            int sum = carry + l1.val + l2.val;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            l1 = (l1.next != null) ? l1.next : empty;
            l2 = (l2.next != null) ? l2.next : empty;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return result.next;
    }
}