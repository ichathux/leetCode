package addStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals ("134", new Solution ().addStrings ("11","123"));
    }
    @Test
    public void test2(){
        assertEquals ("533", new Solution ().addStrings ("456","77"));
    }

    @Test
    public void test3(){
        assertEquals ("9", new Solution ().addStrings ("0","9"));
    }
    @Test
    public void test4(){
        assertEquals ("10", new Solution ().addStrings ("1","9"));
    }
    @Test
    public void test5(){
        assertEquals ("20", new Solution ().addStrings ("1","19"));
    }
    @Test
    public void test6(){
        assertEquals ("108", new Solution ().addStrings ("9","99"));
    }

}