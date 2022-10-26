package NumberOfSegmentsInString;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals (5,new Solution ().countSegments ("Hello, my name is John"));
    }
    @Test
    public void test2(){
        assertEquals (0,new Solution ().countSegments (""));
    }
    @Test
    public void test3(){
        assertEquals (0,new Solution ().countSegments ("                 "));
    }
    @Test
    public void test4(){
        assertEquals (6,new Solution ().countSegments (", , , ,        a, eaefa"));
    }

}