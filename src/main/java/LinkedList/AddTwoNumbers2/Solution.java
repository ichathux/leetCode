package LinkedList.AddTwoNumbers2;

import LinkedList.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode dummy = new ListNode(0,new ListNode(0));
        ListNode temp = dummy;
        int sum = 0;
        int rem;
        while(l1 != null || l2 != null){
            sum = l1.val + l2.val + dummy.next.val;
            rem = sum/10;
            l1 = l1.next;
            l2 = l2.next;
            if(rem > 0){
                dummy.next = new ListNode(sum %10,new ListNode(rem));
                if(l1 == null && l2 == null){
                    l1 = new ListNode(0);
                    l2 = new ListNode(0);
                }
            }else{
                dummy.next = new ListNode(sum,new ListNode(0));
            }
            if(l2 == null && l1 != null){
                l2 = new ListNode(0);
            }
            if(l1 == null && l2 != null){
                l1 = new ListNode(0);
            }
            dummy = dummy.next;
        }
        return reverseList(temp.next).next;
    }
    public ListNode reverseList(ListNode head){
        ListNode prev1 = null;
        ListNode next1 = null;
        while(head != null ){
            next1 = head.next;
            head.next = prev1;
            prev1 = head;
            head = next1;
        }
        return prev1;
    }
}
