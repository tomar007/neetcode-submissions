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
        if(head == null || head.next == null)
            return false; 

        ListNode faster = head;
        ListNode slower = head;

        while(faster != null && faster.next != null){
                slower = slower.next;
                faster = faster.next.next;
           
            if(slower == faster)
                return true;
        }
            
    return false;
    }
}
