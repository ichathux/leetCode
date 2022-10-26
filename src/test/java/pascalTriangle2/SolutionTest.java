package pascalTriangle2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        List<Integer> expectedList = List.of (1,3,3,1);
        assertEquals (expectedList,new Solution ().generate (3));
    }
    @Test
    public void test2(){
        List<Integer> expectedList = List.of (1,13,78,286,715,1287,1716,1716,1287,715,286,78,13,1);
        assertEquals (expectedList,new Solution ().generate (13));
    }
    @Test
    public void test3(){
        List<Integer> expectedList = List.of (1, 8, 28, 56, 70, 56, 28, 8, 1);
        assertEquals (expectedList,new Solution ().generate (8));
    }
    @Test
    public void test4(){
        List<Integer> expectedList = List.of (1,18,153,816,3060,8568,18564,31824,43758,48620,43758,31824,18564,8568,3060,816,153,18,1);
        assertEquals (expectedList,new Solution ().generate (18));
    }
    @Test
    public void test5(){
        List<Integer> expectedList = List.of (1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1);
        assertEquals (expectedList,new Solution ().generate (30));
    }

}