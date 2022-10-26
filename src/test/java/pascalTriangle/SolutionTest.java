package pascalTriangle;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        List<List<Integer>> expectList = new ArrayList<> ();
        expectList = List.of (List.of (1)
                ,List.of (1,1)
                ,List.of (1,2,1)
                ,List.of (1,3,3,1)
                ,List.of (1,4,6,4,1));
        assertEquals (expectList, new Solution ().generate (5));
    }
    @Test
    public void test2(){
        List<List<Integer>> expectList = new ArrayList<> ();
        expectList = List.of (List.of (1)
                ,List.of (1,1)
                ,List.of (1,2,1)
                ,List.of (1,3,3,1)
                ,List.of (1,4,6,4,1)
                ,List.of (1, 5, 10, 10, 5, 1)
                ,List.of (1, 6, 15, 20, 15, 6, 1)
                ,List.of (1, 7, 21, 35, 35, 21, 7, 1)
                ,List.of (1, 8, 28, 56, 70, 56, 28, 8, 1)
                ,List.of (1, 9, 36, 84, 126, 126, 84, 36, 9, 1));
        assertEquals (expectList, new Solution ().generate (10));
    }

}