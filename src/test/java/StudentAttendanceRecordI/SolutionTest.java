package StudentAttendanceRecordI;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertTrue (new Solution ().checkRecord ("PPALLP"));
    }
    @Test
    public void test2(){
        assertFalse (new Solution ().checkRecord ("PPALLL"));
    }

}