package ContainsDuplicates;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertFalse (new Solution ().containsDuplicate (new int[]{1,5,-2,-4,0}));
    }

    @Test
    public void test2(){
        assertTrue (new Solution ().containsDuplicate (new int[]{3,3}));
    }

}