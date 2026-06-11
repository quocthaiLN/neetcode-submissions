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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null, cur = null;
        ListNode node1 = list1, node2 = list2;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                if (res == null) {
                    res = new ListNode(node1.val, null);
                    cur = res;

                } else {
                    cur.next = new ListNode(node1.val, null);
                    cur = cur.next;
                }
                node1 = node1.next;
            } else {
                if (res == null) {
                    res = new ListNode(node2.val, null);
                    cur = res;
                } else {
                    cur.next = new ListNode(node2.val, null);
                    cur = cur.next;
                }
                node2 = node2.next;
            }
        }
        while (node1 != null) {
            if (res == null) {
                res = new ListNode(node1.val, null);
                cur = res;

            } else {
                cur.next = new ListNode(node1.val, null);
                cur = cur.next;
            }
            node1 = node1.next;
        }
        while (node2 != null) {
            if (res == null) {
                res = new ListNode(node2.val, null);
                cur = res;
            } else {
                cur.next = new ListNode(node2.val, null);
                cur = cur.next;
            }
            node2 = node2.next;
        }
        return res;
    }
    
}