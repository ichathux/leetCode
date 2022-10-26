package firstBadVersion;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals (1, new Solution ().firstBadVersion (2));
    }

}