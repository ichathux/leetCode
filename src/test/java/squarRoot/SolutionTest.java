package squarRoot;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (2, new Solution ().mySqrt (4));
    }

    @Test
    public void test2(){
        assertEquals (2, new Solution ().mySqrt (8));
    }

    @Test
    public void test3(){
        assertEquals (5, new Solution ().mySqrt (25));
    }
    @Test
    public void test4(){
        assertEquals (6, new Solution ().mySqrt (47));
    }
    @Test
    public void test5(){
        assertEquals (46340, new Solution ().mySqrt (2147483647));
    }

}