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
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        List<ListNode> linkedList = new LinkedList<>();

        if(head == null){
            return null;
        }

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        Collections.reverse(list);
        ListNode node = new ListNode(list.get(0));
        head = node;

        for(int i=0; i<list.size(); i++){
            if(i == list.size()-1)
                node.next = null;
            else
                node.next = new ListNode(list.get(i+1));

            node = node.next;
        }

    return head;
    }
}
