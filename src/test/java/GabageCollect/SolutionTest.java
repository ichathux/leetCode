package GabageCollect;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (21,
                new Solution ().garbageCollection (new String[]{"G","P","GP","GG"}, new int[]{2,4,3}));
    }

    @Test
    public void test2(){
        assertEquals (37,
                new Solution ().garbageCollection (new String[]{"MMM","PGM","GP"}, new int[]{3,10}));
    }

}