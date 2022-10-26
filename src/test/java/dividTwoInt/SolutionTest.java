package dividTwoInt;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        Assert.assertEquals ("Done",3,new Solution ().divide (10,3));
    }
    @Test
    public void test2(){
        Assert.assertEquals ("Done",-1,new Solution ().divide (-1,1));
    }
    @Test
    public void test3(){
        Assert.assertEquals ("Done",2147483647,new Solution ().divide (
                -2147483648,-1));
    }
    @Test
    public void test4(){
        Assert.assertEquals ("Done",-2,new Solution ().divide (
                7,-3));
    }
    @Test
    public void test5(){
        Assert.assertEquals ("Done",1,new Solution ().divide (
                2,2));
    }
    @Test
    public void test6(){
        Assert.assertEquals ("Done", -2147483648,new Solution ().divide (

                -2147483648,1));
    }
    @Test
    public void test7(){
        Assert.assertEquals ("Done", 1073741823,new Solution ().divide (

                2147483647,2));
    }

    @Test
    public void test8(){
        Assert.assertEquals ("Done", 0,new Solution ().divide (

                1,2));
    }
    @Test
    public void test9(){
        Assert.assertEquals ("Done", -1,new Solution ().divide (

                -1,1));
    }
    @Test
    public void test10(){
        Assert.assertEquals ("Done", -1073741824,new Solution ().divide (
                -2147483648,2));
    }
    @Test
    public void test11(){
        Assert.assertEquals ("Done", 715827882,new Solution ().divide (
                -2147483648,-3));
    }
    @Test
    public void test12(){
        Assert.assertEquals ("Done", 2,new Solution ().divide (
                -1010369383,-2147483648));
    }
    @Test
    public void test13(){
        Assert.assertEquals ("Done", 2,new Solution ().divide (
                2147483647,3));
    }

}