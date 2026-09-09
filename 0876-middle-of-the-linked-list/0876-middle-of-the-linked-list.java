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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int mid = 0;
        ListNode res  = new ListNode(0);
        temp = head;
        ListNode t2 = res;
        System.out.print(count/2);
        while(temp != null){
            if(mid >= count/2){
                t2.next = new ListNode(temp.val);
                t2 = t2.next;
            }
            mid++;
            temp = temp.next;
        }
        return res.next;  
    }
}