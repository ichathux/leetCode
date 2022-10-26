package threeSumArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        int [] arr = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list1 = Arrays.asList(Arrays.asList (-1,0,1),Arrays.asList (-1,-1,2));
        assertEquals (list1, new Solution ().threeSum (arr));
    }
    @Test
    public void test2(){
        int [] arr = new int[]{3,0,-2,-1,1,2};
        List<List<Integer>> list1 = Arrays.asList(Arrays.asList (-2,-1,3),Arrays.asList (-2,0,2), Arrays.asList (-1,0,1));
        assertEquals (list1, new Solution ().threeSum (arr));
    }
//    @Test
//    public void test3(){
//        int [] arr = new int[]{-1,0,1,2,-1,-4};
//        List<List<Integer>> list1 = Arrays.asList(Arrays.asList (-1,0,1),Arrays.asList (-1,-1,2));
//        assertEquals (list1, new Solution ().threeSum (arr));
//    }

}