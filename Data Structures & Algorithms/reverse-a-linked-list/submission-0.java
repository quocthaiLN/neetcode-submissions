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

    private ListNode helper(ListNode parent, ListNode current){
        if(current == null){
            return parent;
        }
        ListNode next = current.next;
        current.next = parent;
        return helper(current, next);
        
    }


    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode parrent = null;
        ListNode current = head;
        return helper(parrent, current);
    }
}
