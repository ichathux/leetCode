package ContainsDuplicates2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertTrue (new Solution ().containsNearbyDuplicate (new int[]{1,2,3,1}, 3));
    }
    @Test
    public void test2(){
        assertTrue (new Solution ().containsNearbyDuplicate (new int[]{1,0,1,1}, 1));
    }
    @Test
    public void test3(){
        assertFalse (new Solution ().containsNearbyDuplicate (new int[]{1,2,3,1,2,3}, 2));
    }
    @Test
    public void test4(){
        assertFalse (new Solution ().containsNearbyDuplicate (new int[]{1,2,1}, 0));
    }
    @Test
    public void test5(){
        assertTrue (new Solution ().containsNearbyDuplicate (new int[]{1,2,1}, 2));
    }

}