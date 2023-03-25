/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // ListNode head;
    public void deleteNode(ListNode node) 
    {
        int val = node.next.val;
        node.val = val;
        if(node.next.next != null){
            node.next = node.next.next;
        }
        else{
            node.next = null;
        }
    }
}