package LongestArithmaticSubsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals (4,new Solution ().longestSubsequence (new int[]{1,2,3,4},1));
    }

    @Test
    public void test2(){
        assertEquals (1,new Solution ().longestSubsequence (new int[]{1,3,5,7},1));
    }

    @Test
    public void test3(){
        assertEquals (4,new Solution ().longestSubsequence (new int[]{1,5,7,8,5,3,4,2,1},-2));
    }

    @Test
    public void test4(){
        assertEquals (2,new Solution ().longestSubsequence (new int[]{2,-6,-3,-6,2,0},-2));
    }
    @Test
    public void test5(){
        assertEquals (2,new Solution ().longestSubsequence (new int[]{3,4,-3,-2,-4},-5));
    }
    @Test
    public void test6(){
        assertEquals (2,new Solution ().longestSubsequence (new int[]{-11,8,8,-13,-4,6,7,-3,8,4,-9,-7,13,-15,9},9));
    }


}