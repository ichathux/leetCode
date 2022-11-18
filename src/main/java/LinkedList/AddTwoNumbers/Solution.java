package LinkedList.AddTwoNumbers;

import LinkedList.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int rest = 0;
        while(l1 != null || l2 != null){
            if(l1 == null){
                if(rest == 0){
                    temp.next = l2;
                }
                l1 = new ListNode(0);
            }
            if(l2 == null){
                if(rest == 0){
                    temp.next = l1;
                }
                l2 = new ListNode(0);
            }
            int sum;
            sum = l1.val + l2.val + rest;
            rest = 0;
            if(sum > 9){
                rest = sum/10;
                sum = sum%10;
            }
            temp.next = new ListNode(sum);

            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;

            if(l1 == null && l2 == null){
                if(rest > 0 ){
                    temp.next = new ListNode(rest);
                }
                break;
            }
        }
        return dummy.next;
    }
}
