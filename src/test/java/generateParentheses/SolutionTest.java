package generateParentheses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        List<String> expected  = Arrays.asList ("()");
        assertEquals (expected,new Solution ().generateParenthesis (1));
    }

    @Test
    public void test2(){
        List<String> expected  = Arrays.asList ("((()))","(()())","(())()","()(())","()()()");
        assertEquals (expected,new Solution ().generateParenthesis (3));
    }

}