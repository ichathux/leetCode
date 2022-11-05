package Fib;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals (5, new Solution ().fib (5));
    }
    @Test
    public void test2(){
        assertEquals (13, new Solution ().fib (7));
    }
}