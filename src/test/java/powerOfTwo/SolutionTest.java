package powerOfTwo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertTrue (new Solution ().isPowerOfTwo (8));
    }

    @Test
    public void test2(){
        assertTrue (new Solution ().isPowerOfTwo (16));
    }
    @Test
    public void test3(){
        assertFalse (new Solution ().isPowerOfTwo (3));
    }
    @Test
    public void test4(){
        assertTrue (new Solution ().isPowerOfTwo (1));
    }

}