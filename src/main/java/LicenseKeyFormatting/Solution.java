package LicenseKeyFormatting;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder(s.toUpperCase ().replaceAll ("-",""));
        for(int i = sb.length ()-k-1; i >= 0; i-=4 ){
            System.out.println (sb.charAt (i));
            sb.insert (i+1,"-");
        }
        return sb.toString ();
    }
}
