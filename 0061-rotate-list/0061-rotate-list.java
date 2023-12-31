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
    public ListNode rotateRight(ListNode head, int k) {
       if( head == null || head.next == null){
           return head;
       }   
        ListNode curr = head;
        int n=1;
        while(curr.next != null){
            curr = curr.next;
             n++;
        }
      //  System.out.print(n);
      ListNode pre = head;
      int i =0;
      while(i<(n-k%n-1)){
          pre = pre.next;
     i++; }
        curr.next = head;
        ListNode a = pre.next;
        pre.next = null;
        head = a;


    return head; }
}