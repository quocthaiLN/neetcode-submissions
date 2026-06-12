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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();

        ListNode node = head;
        int idx = -1;
        
        while(node != null){
            if(node.next != null && map.containsKey(node.next)){
                return true;
            }
            idx++;
            map.put(node, idx);
            node = node.next;
        }
        return false;
    }
}
