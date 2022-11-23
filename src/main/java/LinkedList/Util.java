package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Util {
    public static void print(ListNode head){
        System.out.print ("[");
        while (head != null){
            System.out.print (head.val);
            head = head.next;
            if (head != null){
                System.out.print (", ");
            }
        }
        System.out.print ("]");
    }
    public static String toStringList(ListNode head){
        StringBuilder sb = new StringBuilder ();
        sb.append ("[");
        while (head != null){
            sb.append (head.val);
            head = head.next;
            if (head != null){
                sb.append (", ");
            }
        }
        sb.append ("]");
        return sb.toString ();
    }
}
