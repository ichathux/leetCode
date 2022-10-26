package threeSumWithMul;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (20,new Solution ().threeSumMulti (new int[]{1,1,2,2,3,3,4,4,5,5},8));
    }

    @Test
    public void test2(){
        assertEquals (12,new Solution ().threeSumMulti (new int[]{1,1,2,2,2,2},5));
    }

    @Test
    public void test3(){
        assertEquals (1,new Solution ().threeSumMulti (new int[]{2,1,3},6));
    }

}