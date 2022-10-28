package AllNumbersDisappearedInArray;

import org.junit.Test;

import java.awt.*;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (List.of (5,6), new Solution ().findDisappearedNumbers (new int[]{4,3,2,7,8,2,3,1}));
    }
    @Test
    public void test2(){
        assertEquals (List.of (5,6), new Solution ().findDisappearedNumbers (new int[]{4,3,2,7,8,2,3,1}));
    }
    @Test
    public void test3(){
        assertEquals (List.of (1), new Solution ().findDisappearedNumbers (new int[]{2,2}));
    }

}