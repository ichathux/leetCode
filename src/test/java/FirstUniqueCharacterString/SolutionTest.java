package FirstUniqueCharacterString;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (0,new Solution ().firstUniqChar ("leetcode"));
    }
    @Test
    public void test2(){
        assertEquals (2,new Solution ().firstUniqChar ("loveleetcode"));
    }

}