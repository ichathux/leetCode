package LinkedList.MergeTwoLinkedList;

import LinkedList.ListNode;
import LinkedList.Util;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        if(list1 == null){
            tail.next = list2;
        }
        if(list2 == null){
            tail.next = list1;
        }
        while(tail != null && list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }

            if(list1 == null){
                tail.next.next = list2;
            }
            if(list2 == null){
                tail.next.next = list1;
            }
            tail = tail.next;

        }
        Util.print (dummy);
        return dummy.next;
    }
}
