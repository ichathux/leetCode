package triangularSumOfArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (8, new Solution ().triangularSum (new int[]{1,2,3,4,5}));
    }

}