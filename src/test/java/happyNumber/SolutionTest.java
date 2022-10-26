package happyNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertTrue (new Solution ().isHappy (19));
    }

    @Test
    public void test2(){
        assertTrue (new Solution ().isHappy (100));
    }

    @Test
    public void test3(){
        assertFalse (new Solution ().isHappy (2));
    }

    @Test
    public void test4(){
        assertFalse (new Solution ().isHappy (789));
    }

}