package LinkedList.MergeInBetweenLinkedLists;

import LinkedList.ListNode;

public class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode current1 = list1;
        ListNode current2 = list1;
        while(b != 0){
            b--;
            current2 = current2.next;
        }
        ListNode tail = current2.next;
        while(current1.next != null){
            if(a==1){
                current1.next = list2;
            }
            a--;
            current1 = current1.next;
        }
        current1.next = tail;
        return list1;
    }
}
