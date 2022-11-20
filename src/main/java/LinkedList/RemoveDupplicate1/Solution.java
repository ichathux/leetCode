package LinkedList.RemoveDupplicate1;

import LinkedList.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode prevNode = null;
        while(current != null){

            if(prevNode != null ){
                if (prevNode.val == current.val){
                    prevNode.next = current.next;
                    current = prevNode;
                }
            }
            prevNode = current;
            current = current.next;
        }
        return head;
    }
}
