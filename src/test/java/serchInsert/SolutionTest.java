package serchInsert;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (6, new Solution ().searchInsert (new int[]{1,3,5,6,8,9,10,23,56},20));
    }
    @Test
    public void test2(){
        assertEquals (1, new Solution ().searchInsert (new int[]{1,3},2));
    }
    @Test
    public void test3(){
        assertEquals (2, new Solution ().searchInsert (new int[]{1,3,5},4));
    }

}