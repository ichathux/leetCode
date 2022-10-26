package PlusOne;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertArrayEquals ("matched" ,new int[]{1,2,4} ,new Solution().plusOne (new int[]{1,2,3}));
    }
    @Test
    public void test2(){
        assertArrayEquals ("matched" ,new int[]{4,3,2,2} ,new Solution().plusOne (new int[]{4,3,2,1}));
    }
    @Test
    public void test3(){
        assertArrayEquals ("matched" ,new int[]{1,0} ,new Solution().plusOne (new int[]{9}));
    }
    @Test
    public void test4(){
        assertArrayEquals ("matched" ,new int[]{1,0,0,0} ,new Solution().plusOne (new int[]{9,9,9}));
    }
    @Test
    public void test5(){
        assertArrayEquals ("matched" ,new int[]{1,0,0,0} ,new Solution().plusOne (new int[]{9,9,9}));
    }
    @Test
    public void test6(){
        assertArrayEquals ("matched" ,new int[]{9,9,0} ,new Solution().plusOne (new int[]{9,8,9}));
    }

    @Test
    public void test7(){
        assertArrayEquals ("matched" ,new int[]{9,8,7,6,5,4,3,2,1,1} ,new Solution().plusOne (new int[]{9,8,7,6,5,4,3,2,1,0}));
    }

    @Test
    public void test8(){
        assertArrayEquals ("matched" ,new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7} ,new Solution().plusOne (new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6}));
    }

}