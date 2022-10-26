package integerToRoman;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals ("MMM", new Solution ().intToRoman (3000));

    }
}