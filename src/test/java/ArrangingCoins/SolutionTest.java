package ArrangingCoins;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (2, new Solution ().arrangeCoins (5));
    }
    @Test
    public void test2(){
        assertEquals (65535, new Solution ().arrangeCoins (2147483647));
    }
    @Test
    public void test3(){
        assertEquals (1, new Solution ().arrangeCoins (1));
    }

}