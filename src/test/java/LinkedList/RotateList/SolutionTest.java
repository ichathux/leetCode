package LinkedList.RotateList;

import LinkedList.ListNode;
import LinkedList.Util;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        ListNode first = new ListNode (1,new ListNode (2, new ListNode (3,new ListNode (4))));
        ListNode answer = new ListNode (4,new ListNode (1, new ListNode (2,new ListNode (3))));
        assertEquals (Util.toStringList (answer) , Util.toStringList (new Solution ().rotateRight (first,1)));
    }
    @Test
    public void test2(){
        ListNode first = new ListNode (1,new ListNode (2, new ListNode (3,new ListNode (4))));
        ListNode answer = new ListNode (2,new ListNode (3, new ListNode (4,new ListNode (1))));
        assertEquals (Util.toStringList (answer) , Util.toStringList (new Solution ().rotateRight (first,3)));
    }

}