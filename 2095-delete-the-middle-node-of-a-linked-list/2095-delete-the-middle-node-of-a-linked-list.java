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
    public ListNode deleteMiddle(ListNode head) {
        int len = 0;
        ListNode node = head;
        while(node.next != null){
            len++;
            node = node.next;
        }
        if(len%2 !=0) len++;
        if(len == 0) return head.next;
        node = head;
        ListNode prev = node;
        int index = 0;
        while(index != len/2){
            index++;
            prev = node;
            node = node.next;
        }
        prev.next = node.next;
        return head;

    }
}