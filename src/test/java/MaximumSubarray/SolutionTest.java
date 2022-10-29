package MaximumSubarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (6, new Solution ().maxSubArray (new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    public void test2(){
        assertEquals (6, new Solution ().maxSubArray (new int[]{1,2,-1,-2,2,1,-2,1,4,-5,4}));
    }
    @Test
    public void test3(){
        assertEquals (-1, new Solution ().maxSubArray (new int[]{-1}));
    }
    @Test
    public void test4(){
        assertEquals (-1, new Solution ().maxSubArray (new int[]{-2,-1}));
    }

}