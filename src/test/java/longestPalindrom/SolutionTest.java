package longestPalindrom;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals ("bab", new Solution ().longestPalindrome ("babad")); //dabab
    }
    @Test
    public void test2(){
        assertEquals ("bb", new Solution ().longestPalindrome ("cbbd")); //dabab
    }
    @Test
    public void test3(){
        assertEquals ("a", new Solution ().longestPalindrome ("a")); //dabab
    }
    @Test
    public void test4(){
        assertEquals ("a", new Solution ().longestPalindrome ("ac")); //dabab
    }
    @Test
    public void test5(){
        assertEquals ("ccc", new Solution ().longestPalindrome ("ccc")); //dabab
    }
    @Test
    public void test6(){
        assertEquals ("bb", new Solution ().longestPalindrome ("abb")); //dabab
    }
    @Test
    public void test7(){
        assertEquals ("aba", new Solution ().longestPalindrome ("caba")); //dabab
    }
    @Test
    public void test8(){
        assertEquals ("ccccccc", new Solution ().longestPalindrome ("ccccccc")); //dabab
    }


}