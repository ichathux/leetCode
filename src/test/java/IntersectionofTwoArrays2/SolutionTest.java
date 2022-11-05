package IntersectionofTwoArrays2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertArrayEquals (new int[]{2,2}, new Solution().intersect (new int[]{1,2,2,1}, new int[]{2,2}));
    }
    @Test
    public void test2(){
        assertArrayEquals (new int[]{9,4}, new Solution().intersect (new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }
    @Test
    public void test3(){
        assertArrayEquals (new int[]{1,2}, new Solution().intersect (new int[]{1,2,2,1}, new int[]{1,2}));
    }
    @Test
    public void test4(){
        assertArrayEquals (new int[]{9,1}, new Solution().intersect (new int[]{9,1}, new int[]{7,8,3,9,0,0,9,1,5}));
    }

}