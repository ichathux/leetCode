package BasicCal;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (3+2*2,new Solution ().calculate ("3+2*2"));
    }

    @Test
    public void test2(){
        assertEquals (3+2*2+1*6,new Solution ().calculate ("3+2*2+1*6"));
    }

    @Test
    public void test3(){
        assertEquals (30+2*22+1*61,new Solution ().calculate ("30+2*22+1*61"));
    }

    @Test
    public void test4(){
        assertEquals (30+2*22-1*61,new Solution ().calculate ("30+2*22-1*61"));
    }
    @Test
    public void test5(){
        assertEquals (3/2,new Solution ().calculate (" 3/2 "));
    }
    @Test
    public void test6(){
        assertEquals (3+5 / 2,new Solution ().calculate (" 3+5 / 2"));
    }
    @Test
    public void test7(){
        assertEquals (1+1,new Solution ().calculate (" 1 + 1"));
    }
    @Test
    public void test8(){
        assertEquals (2*3*4,new Solution ().calculate ("2*3*4"));
    }

}