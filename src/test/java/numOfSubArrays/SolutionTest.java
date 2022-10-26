package numOfSubArrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals (3,
                new Solution ().numOfSubarrays (new int[]{2,2,2,2,5,5,5,8}, 3,4));
    }

    @Test
    public void test2(){
        assertEquals (6,
                new Solution ().numOfSubarrays (new int[]{11,13,17,23,29,31,7,5,2,3}, 3,5));
    }

    @Test
    public void test3(){
        assertEquals (5,
                new Solution ().numOfSubarrays (new int[]{1,1,1,1,1}, 1,0));
    }

}