package FirstUniqueCharacterString;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {
    @Test
    public void test1(){
        assertEquals (0,new Solution2 ().firstUniqChar ("leetcode"));
    }
    @Test
    public void test2(){
        assertEquals (2,new Solution2 ().firstUniqChar ("loveleetcode"));
    }
    @Test
    public void test3(){
        assertEquals (-1,new Solution2 ().firstUniqChar ("lovveleettccodde"));
    }
    @Test
    public void test4(){
        assertEquals (0,new Solution2 ().firstUniqChar ("dabbcb"));
    }

}