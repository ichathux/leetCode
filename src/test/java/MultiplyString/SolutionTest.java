package MultiplyString;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
//        assertEquals ("6", new Solution ().multiply ("2","4"));
        assertEquals ("56088", new Solution ().multiply ("123","456"));
    }

    @Test
    public void test2(){
//        assertEquals ("6", new Solution ().multiply ("2","4"));
        assertEquals ("5535", new Solution ().multiply ("123","45"));
    }
    @Test
    public void test4(){
//        assertEquals ("6", new Solution ().multiply ("2","4"));
        assertEquals ("81", new Solution ().multiply ("9","9"));
    }
    @Test
    public void test5(){
//        assertEquals ("6", new Solution ().multiply ("2","4"));
        assertEquals ("891", new Solution ().multiply ("9","99"));
    }

    @Test
    public void test6(){
//        assertEquals ("6", new Solution ().multiply ("2","4"));
        assertEquals ("1222155", new Solution ().multiply ("12345","99"));
    }
    @Test
    public void test7(){
//        assertEquals ("6", new Solution ().multiply ("2","4"));
        assertEquals ("121932631112635269", new Solution ().multiply ("123456789","987654321"));
    }
    @Test
    public void test8(){
//        assertEquals ("6", new Solution ().multiply ("2","4"));
        assertEquals ("53746843983", new Solution ().multiply ("881095803","61"));
    }

}