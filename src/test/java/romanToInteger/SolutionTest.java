package romanToInteger;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (3,new Solution ().romanToInt ("III"));
    }
    @Test
    public void test2(){
        assertEquals (49,new Solution ().romanToInt ("XLIX"));
    }
    @Test
    public void test3(){
        assertEquals (58,new Solution ().romanToInt ("LVIII"));
    }
    @Test
    public void test4(){
        assertEquals (1994,new Solution ().romanToInt ("MCMXCIV"));
    }

}