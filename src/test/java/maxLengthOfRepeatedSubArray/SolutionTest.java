package maxLengthOfRepeatedSubArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals (3, new Solution ().findLength (new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
    }
    @Test
    public void test2(){
        assertEquals (3, new Solution ().findLength (new int[]{1,2,3,2,1}, new int[]{3,2,1,4}));
    }
    @Test
    public void test3(){
        assertEquals (6, new Solution ().findLength (new int[]{0,0,0,0,0,0}, new int[]{0,0,0,0,0,0}));
    }
    @Test
    public void test4(){
        assertEquals (4, new Solution ().findLength (new int[]{0,0,0,0,1}, new int[]{1,0,0,0,0}));
    }
    @Test
    public void test5(){
        assertEquals (4, new Solution ().findLength (new int[]{0,0,0,0,0,0,1,0,0,0}, new int[]{0,0,0,0,0,0,0,1,0,0}));
    }

}