package longestSubstring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (3,new Solution ().lengthOfLongestSubstring ("abcabcbb"));
    }

}