package MoveZeros;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        assertEquals (new int[]{ 1 , 3 , 12 , 0 , 0 } , new Solution ().moveZeroes (new int[]{ 0 , 1 , 0 , 3 , 12 }));
    }
}