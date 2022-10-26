package timeToRearrangeBinaray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (4,new Solution ().secondsToRemoveOccurrences ("0110101"));
    }

    @Test
    public void test2(){
        assertEquals (0,new Solution ().secondsToRemoveOccurrences ("11100"));
    }
    @Test
    public void test3(){
        assertEquals (4,new Solution ().secondsToRemoveOccurrences ("001011"));
    }

}