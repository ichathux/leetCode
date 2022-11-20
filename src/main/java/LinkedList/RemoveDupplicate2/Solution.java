package LinkedList.RemoveDupplicate2;

import LinkedList.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode prevNode = null;

        ListNode temp = new ListNode(-999);
        ListNode dummy = temp;
        while(current != null){
            if(current.val != dummy.val){
                if(prevNode != null && prevNode.val == current.val){
                }else{
                    dummy.next = new ListNode(current.val);
                    dummy = dummy.next;
                }
            }else{
                ListNode c = temp;
                if(c.next == null){
                    continue;
                }
                while(c.next.next != null){
                    c = c.next;
                }
                c.next = null;
                dummy = c;
            }
            prevNode = current;
            current = current.next;
        }
        return temp.next;
    }
}
