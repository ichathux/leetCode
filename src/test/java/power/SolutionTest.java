package power;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (1024, new Solution ().myPow (2,10),0);
    }
    @Test
    public void test2(){
        assertEquals (0.25, new Solution ().myPow (2,-2),0);
    }
    @Test
    public void test3(){
        assertEquals (-2529.9550389278597, new Solution ().myPow (-13.62608,3),0);
    }
    @Test
    public void test4(){
        assertEquals (4, new Solution ().myPow (-2,2),0);
    }
    @Test
    public void test5(){
        assertEquals (0, new Solution ().myPow (0.00001,2147483647),0);
    }
    @Test
    public void test6(){
        assertEquals (1, new Solution ().myPow (0.44528,0),0);
    }
    @Test
    public void test7(){
        assertEquals (0, new Solution ().myPow (2,-2147483648),0);
    }
    @Test
    public void test8(){
        assertEquals (1, new Solution ().myPow (1.00,-2147483648),0);
    }
    @Test
    public void test9(){
        assertEquals (1, new Solution ().myPow (-1.000,-2147483648),0);
    }
    @Test
    public void test10(){
        assertEquals (54.83508094098968, new Solution ().myPow (0.44894, -5),0);
    }
    @Test
    public void test11(){
        assertEquals (1, new Solution ().myPow (1.000, 2147483647),0);
    }

}