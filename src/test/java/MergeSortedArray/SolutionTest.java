package MergeSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertArrayEquals (new int[]{1,2,2,3,5,6},new Solution ().merge (new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6},3));
    }

    @Test
    public void test2(){
        assertArrayEquals (new int[]{1,2,2,3,5,6,7},new Solution ().merge (new int[]{1,2,3,7,0,0,0}, 4, new int[]{2,5,6},3));
    }
    @Test
    public void test3(){
        assertArrayEquals (new int[]{1},new Solution ().merge (new int[]{1}, 1, new int[]{},0));
    }
    @Test
    public void test4(){
        assertArrayEquals (new int[]{1},new Solution ().merge (new int[]{0}, 0, new int[]{1},1));
    }
    @Test
    public void test5(){
        assertArrayEquals (new int[]{1,2,3,4,5,6},new Solution ().merge (new int[]{4,0,0,0,0,0}, 1, new int[]{1,2,3,5,6},5));
    }
    @Test
    public void test6(){
        assertArrayEquals (new int[]{1,2,3,4,5,6},new Solution ().merge (new int[]{4,5,6,0,0,0}, 3, new int[]{1,2,3},3));
    }
    @Test
    public void test7(){
        assertArrayEquals (new int[]{1,2,3,4,5,6},new Solution ().merge (new int[]{1,2,4,5,6,0}, 5, new int[]{3},1));
    }

}