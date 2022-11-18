package LinkedList.MergeTwoLinkedList;

import LinkedList.ListNode;
import LinkedList.Util;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){

        ListNode first = new ListNode (1,new ListNode (2, new ListNode (4)));
        ListNode second = new ListNode (1,new ListNode (3, new ListNode (4)));
        ListNode answer = new ListNode (1,new ListNode (1, new ListNode (2,new ListNode (3,new ListNode (4,new ListNode (4))))));
        assertEquals (Util.toStringList (answer) , Util.toStringList (new Solution ().mergeTwoLists (first,second)));
    }

}