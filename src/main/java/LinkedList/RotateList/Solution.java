package LinkedList.RotateList;

import LinkedList.ListNode;
import LinkedList.Util;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        System.out.println ("Init k "+k);
        int size = 0;
        if(head == null || k == 0 || head.next == null){
            return head;
        }
        ListNode lastNode = null;
        ListNode temp = head;
        while (k > 0){
            ListNode current = temp;
            while (current != null){
                size++;
                if (current.next == null){
                    lastNode = current;
                }
                current = current.next;
            }
            if (k > size){
                if (k%size == 0) {
                    return head;
                }
                if (k%size > 0){
                    k = k%size;
                }
            }
            ListNode current1 = temp;
            while (current1.next.next != null){
                current1 = current1.next;
            }
            current1.next = null;
            lastNode.next = temp;
            k--;
            temp = lastNode;
        }
        return lastNode;
    }
}
