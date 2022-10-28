package LicenseKeyFormatting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals ("5F3Z-2E9W", new Solution ().licenseKeyFormatting ("5F3Z-2e-9-w",4));
    }

}