package longestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals ("match", "fl", new Solution ().longestCommonPrefix (new String[]{"flower","flow","flight"}));
    }
    @Test
    public void test3(){
        assertEquals ("match", "flower", new Solution ().longestCommonPrefix (new String[]{"flower","flower","flower","flower"}));
    }
    @Test
    public void test2(){
        assertEquals ("match", "", new Solution ().longestCommonPrefix (new String[]{""}));
    }
    @Test
    public void test4(){
        assertEquals ("match", "", new Solution ().longestCommonPrefix (new String[]{"c","acc","ccc"}));
    }
    @Test
    public void test5(){
        assertEquals ("match", "a", new Solution ().longestCommonPrefix (new String[]{"ab","a"}));
    }

    @Test
    public void test6(){
        assertEquals ("match", "a", new Solution ().longestCommonPrefix (new String[]{"acc","aaa","aaba"}));
    }

}